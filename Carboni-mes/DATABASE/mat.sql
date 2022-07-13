--발주코드의 자재코드 외래키 
ALTER TABLE matord ADD CONSTRAINT fk_matinfo_to_matord_micode
FOREIGN KEY (MICODE) REFERENCES matinfo(MICODE);
--발주코드의 거래처 외래키 생성
ALTER TABLE matord ADD CONSTRAINT fk_matinfo_to_matord_cscode
foreign key (cscode) REFERENCES costomer(cscode);
--의뢰 번호 생성 
ALTER TABLE matord ADD CONSTRAINT FK_MATREQ_TO_MATORD_REQNUM
foreign key (REQNUM) REFERENCES MATREQ(REQNUM);
--발주관리 발주번호 시퀀스
create sequence matord_MONUM_seq
    increment by 1
    start with 1
    nocache;
--발주 모든 목록 
--insert 문 select 문으로 치환할것 
  insert into matord values ('MO-'||to_char(matord_MONUM_seq.nextval),(select micode from matinfo where micode ='11')
    ,(select cscode from costomer where cscode='1'),(select reqnum from matreq where reqnum='1'),
    sysdate,sysdate,1,1,1,'1',
    (select miname from matinfo where micode ='11'),(select csname from costomer where cscode='1'));

--요청번호에따른 목록 조회
select e.reqnum,e.mrreqam,e.micode,d.miname
    from matreq e
    join matinfo d on e.micode=d.micode
    where e.micode='11';
    
--생산에서 넘어오는 요청 사항 
--상태가 n인것만 출력
SELECT E.REQNUM,E.MRREQAM,E.MICODE,E.MRSTATUS,D.MINAME
    FROM MATREQ E
    JOIN MATINFO D ON E.MICODE=D.MICODE
    where E.MRSTATUS ='N';
   --발주 업체 모두 선택 
  select cscode,csname,csnum,cstel
  from costomer ;
  --발주 업체 거래처코드에 따라선택 
  select cscode,csname,csnum,cstel
  from costomer
  where cscode ='';
  --자재코드 모두선택 (자재코드 자재명 규격 자재단위
  select micode,miname,mistand,miunit
  from matinfo;
  --자제코드에 따라 선택
  select micode,miname,mistand,miunit
  from matinfo 
  where micode='';
  
  
  --발주 화면의 발주업체 조회
  select cscode, csname, csnum, cstel from costomer
  where csgb='자재거래';
  
  --발주 화면의 자재코드 조회
  select micode,miname,mistand,miunit from matinfo;
 