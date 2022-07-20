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

-- or

--insert into lineinfo
--values ('LIN-CBN-'||lineinfo_LINEID_seq.nextval, 'BRA-1', 'MOL-1', 'PAC-1', '1');
--insert into lineinfo
--values ('LIN-CBN-'||lineinfo_LINEID_seq.nextval, 'BRA-2', 'MOL-1', 'PAC-1', '1');
--insert into lineinfo
--values ('LIN-CBN-'||lineinfo_LINEID_seq.nextval, 'BRA-3', 'MOL-1', 'PAC-1', '1');
--insert into lineinfo
--values ('LIN-CBN-'||lineinfo_LINEID_seq.nextval, 'BRA-4', 'MOL-1', 'PAC-1', '1');
--insert into lineinfo
--values ('LIN-CBN-'||lineinfo_LINEID_seq.nextval, 'BRA-1', 'MOL-2', 'PAC-1', '1');
--insert into lineinfo
--values ('LIN-CBN-'||lineinfo_LINEID_seq.nextval, 'BRA-2', 'MOL-2', 'PAC-1', '1');
--insert into lineinfo
--values ('LIN-CBN-'||lineinfo_LINEID_seq.nextval, 'BRA-3', 'MOL-2', 'PAC-1', '1');
--insert into lineinfo
--values ('LIN-CBN-'||lineinfo_LINEID_seq.nextval, 'BRA-4', 'MOL-2', 'PAC-1', '1');

   