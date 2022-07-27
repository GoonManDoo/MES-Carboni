-- 자재발주요청 테이블 시퀀스 생성
create sequence matreq_REQNUM_seq
    increment by 1
    start with 1
    nocache;
    
-- 생산계획관리 테이블 시퀀스 생성
create sequence prodplan_PPNUM_seq
	increment by 1
    start with 1
    nocache;
    

-- 생산지시관리 테이블 시퀀스 생성
create sequence prodcomm_PCNUM_seq
	increment by 1
    start with 1
    nocache;
    

-- 생산라인정보 테이블 시퀀스 생성
    create sequence lineinfo_LINEID_seq
	increment by 1
    start with 1
    nocache;
    
    
    
-- 생산공정정보 insert
insert into procinfo
values ('BRA-1', '브레이딩공정_1', '700k', '1Ø', '50˚', '1000mm/Min', 2, null);
insert into procinfo
values ('BRA-2', '브레이딩공정_2', '800k', '9Ø', '100˚', '2000mm/Min', 2, null);
insert into procinfo
values ('BRA-3', '브레이딩공정_3', '1000k', '15Ø', '150˚', '3000mm/Min', 2, null);
insert into procinfo
values ('BRA-4', '브레이딩공정_4', '1100k', '40Ø', '175˚', '4000mm/Min', 2, null);

insert into procinfo
values ('MOL-1', '성형공정_1', '열강화수지', 'AirPresure', '250m', '150℃', 2, null);
insert into procinfo
values ('MOL-2', '성형공정_2', '열가소수지', 'AirOven', '400m', '220℃', 2, null);

insert into procinfo
values ('PAC-1', '100x700', null, null, null, null, 2, null);


-- 생산라인정보 insert
insert into lineinfo
values ('LIN-CBN-'||lineinfo_LINEID_seq.nextval, 1, 'BRA-1', '1');
insert into lineinfo
values ('LIN-CBN-'||lineinfo_LINEID_seq.currval, 2, 'MOL-1', '1');
insert into lineinfo
values ('LIN-CBN-'||lineinfo_LINEID_seq.currval, 3, 'PAC-1', '1');

insert into lineinfo
values ('LIN-CBN-'||lineinfo_LINEID_seq.nextval, 1, 'BRA-2', '2');
insert into lineinfo
values ('LIN-CBN-'||lineinfo_LINEID_seq.currval, 2, 'MOL-2', '2');
insert into lineinfo
values ('LIN-CBN-'||lineinfo_LINEID_seq.currval, 3, 'PAC-1', '2');


-- 생산지시상세등록+생산계획 상태 업데이트 프로시저
CREATE PROCEDURE add_proccomm_d
    (p_pcnum IN prodcomm.pcnum%TYPE,
    p_pcdnum IN proccomm_d.pcdnum%TYPE,
    p_lineid IN proccomm_d.lineid%TYPE,
    p_ppdnum IN prodplan_d.ppdnum%TYPE,
    p_gicode IN proccomm_d.gicode%TYPE,
    p_pcdam IN proccomm_d.pcdam%TYPE,
    p_pcdsdate IN proccomm_d.pcdsdate%TYPE)
IS
    v_pidtsum procinfo.pidate%TYPE;
begin
    select sum(pidate)
    into v_pidtsum
    from procinfo
    where picodeid in (select picodeid from lineinfo where gicode = p_gicode);

    insert into proccomm_d
    values (p_pcdnum, p_pcnum, p_lineid, p_ppdnum, p_gicode, p_pcdam, '정상', p_pcdsdate, p_pcdsdate+v_pidtsum);
    
    update prodplan
    set ppstatus = '지시진행'
    where ppnum = SUBSTR(p_ppdnum, 1, 4);
end;
/

-- 생산계획+상세 삭제 / 생산의뢰 업데이트 프로시저
CREATE PROCEDURE update_preqstatus
    (p_ppnum prodplan.ppnum%TYPE)
IS
v_prnum prodreq.prnum%TYPE;
BEGIN
    select prnum into v_prnum from prodplan_d where ppdnum like p_ppnum||'%';
    
    update prodreq set prstatus = 'N' where prnum = v_prnum;

    delete from prodplan where ppnum = p_ppnum;
    
    delete from prodplan_d where ppdnum like p_ppnum||'%';
END;
/

-- 공정진행상세 인서트
create or replace PROCEDURE add_prochead_d
    (p_phdnum IN prochead_d.phdnum%TYPE,
    p_phnum IN prochead.phnum%TYPE,
    p_sinum IN prochead_d.sinum%TYPE,
    p_phdstime IN prochead_d.phdstime%TYPE,
    p_phdetime IN prochead_d.phdetime%TYPE,
    p_phdmkam IN prochead_d.phdmkam%TYPE,
    p_phderram IN prochead_d.phderram%TYPE,
    p_phdstat IN prochead_d.phdstat%TYPE,
    p_pcnum IN prodcomm.pcnum%TYPE,
    p_picodeid IN prochead_d.picodeid%TYPE)
IS
begin
    INSERT INTO prochead_d
    VALUES
    (p_phdnum, p_phnum, p_sinum, p_phdstime, p_phdetime, p_phdmkam, p_phderram, p_phdstat, p_picodeid);

    update prodcomm
    set pcstatus = '공정완료'
    where pcnum = p_pcnum;
end;
/

-- 자재출고 시퀀스
CREATE SEQUENCE  "CARBONI"."MATSAR_OUTMSNUM_SEQ" MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT
BY 1 START
WITH 33 NOCACHE  NOORDER  NOCYCLE ;

-- 자재출고 insert, 자재재고 update
CREATE OR REPLACE PROCEDURE update_mat
    (p_pcnum IN proccomm_d.pcnum%TYPE)
IS
    v_pcdam proccomm_d.pcdam%TYPE;
    v_soyo number;
    -- 제품별 자재 소요량 알아오는 커서
    CURSOR mibam_cursor IS
        select m.micode, b.bam
        from proccomm_d d, bom b, matinfo m
        where (d.gicode = b.gicode and b.micode = m.micode)
        and d.pcnum = p_pcnum;
BEGIN
    -- 생산지시량
    select pcdam
    into v_pcdam
    from proccomm_d
    where pcnum = p_pcnum;
    
    -- 사용하는 자재코드만큼 자재출고관리 insert, 자재재고량 update
    FOR mibam_record IN mibam_cursor LOOP
        v_soyo := v_pcdam*(mibam_record.bam);
       
        insert into matsar
        values ('OUTMS-'||matsar_outmsnum_seq.nextval, null, null, p_pcnum, '비고', null, sysdate, null, v_soyo, mibam_record.micode);
        
        update matstk
        set msciam = msciam - v_soyo
        where micode = mibam_record.micode;
    END LOOP;
END;
/


-- 수주상태, 제품재고 update
create or replace procedure update_constk  
    (p_pcdnum proccomm_d.pcdnum%TYPE,
    p_phdmkam prochead_d.phderram%TYPE)
IS
    v_cnnum contract.cnnum%TYPE;
    v_gicode goodsinfo.gicode%TYPE;
BEGIN
    select c.cnnum, d.gicode
    into v_cnnum, v_gicode
    from proccomm_d d, prodplan_d p, prodreq r, contract c
    where (d.ppdnum = p.ppdnum and p.prnum = r.prnum and r.cnnum = c.cnnum)
    and d.pcdnum = p_pcdnum;
    
    update contract
    set cnstatus = '납품전'
    where cnnum = v_cnnum;
    
    update goodsstk
    set gsam = gsam + p_phdmkam
    where gicode = v_gicode;
END;
/

-- 스케줄러 프로시저
create or replace PROCEDURE schedule
    (p_sinum1 sysinfo.sinum%TYPE,
    p_sinum2 sysinfo.sinum%TYPE)
IS
    v_phdstime prochead_d.phdstime%TYPE;
    v_sstatus dummy.sstatus%TYPE;
BEGIN
    IF p_sinum1 IS NULL THEN
        -- 첫번째행
        select phdstime
        into v_phdstime
        from dummy
        where sinum = p_sinum2 and sstatus = 'N';

        IF v_phdstime IS NULL THEN
            update dummy
            set phdstime = to_char(sysdate, 'HH24:MM:SS')
            where sinum = p_sinum2;
        ELSE
            update dummy
            set phdetime = to_char(sysdate, 'HH24:MM:SS'), sstatus = 'Y'
            where sinum = p_sinum2;
        END IF;
    ELSE
        select sstatus
        into v_sstatus
        from dummy
        where sinum = p_sinum1;
        
        IF v_sstatus = 'Y' THEN
            -- 두번째행
            select phdstime
            into v_phdstime
            from dummy
            where sinum = p_sinum2 and sstatus = 'N';
    
            IF v_phdstime IS NULL THEN
                update dummy
                set phdstime = to_char(sysdate, 'HH24:MM:SS')
                where sinum = p_sinum2;
            ELSE
                update dummy
                set phdetime = to_char(sysdate, 'HH24:MM:SS'), sstatus = 'Y'
                where sinum = p_sinum2;
            END IF;
        END IF;
    END IF;
    
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('데이터가 없습니다.');
END;

   