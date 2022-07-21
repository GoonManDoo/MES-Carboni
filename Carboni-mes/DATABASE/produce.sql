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



   