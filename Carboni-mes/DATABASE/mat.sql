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
 -- 발주 테이블 더미데이터 
  
    insert into matord values ('MO-'||to_char(matord_MONUM_seq.nextval),(select micode from matinfo where micode ='1')
    ,(select cscode from costomer where cscode='1'),(select reqnum from matreq where reqnum='req-1'),
    sysdate,sysdate,1,1,1,'N');
    
       insert into matord values ('MO-'||to_char(matord_MONUM_seq.nextval),(select micode from matinfo where micode ='2')
    ,(select cscode from costomer where cscode='3'),(select reqnum from matreq where reqnum='req-2'),
    sysdate,sysdate,3,14,12,'N');
    
 --발주일자로 조회할떄 안에 셀렉트
  select e.monum,e.moodate,e.micode,d.miname
  from matord e join matinfo d 
  on e.micode = d.micode;
  
  --찐 발주일자로 조회
    select e.monum,e.moodate,e.micode,d.miname
  from matord e join matinfo d 
  on e.micode = d.micode
  where e.moodate >= to_date('2022/01/22','YYYY/MM/DD')
  AND 
  to_date('2022/07/22','YYYY/MM/DD')>= e.moodate;
  
  --발주일자 거래처 코드 자재코드 넣어서 메인 그리드에 출력
select o.moodate,o.micode,o.cscode,m.miname,c.csname,k.msciam
from matord o,matinfo m, matstk k,costomer c
where o.micode = m.micode
and k.micode = o.micode
and o.cscode = c.cscode
and c.cscode = '1'
and m.micode = '1'
and o.moodate >= TO_DATE('2022/07/11','YYYY/MM/DD')
and TO_DATE('2022/07/31','YYYY/MM/DD') >= o.moodate;

--입고관리에서 발주일자로 입고관리로 넘길 정보 검색
select o.moodate,o.monum,o.cscode,o.micode,c.csname,m.miname
from matord o ,costomer c, matinfo m
where o.micode=m.micode
and c.cscode = o.cscode;
--여기에 관련 날짜도 같이 
and o.moodate >= TO_DATE('2022/07/11','YYYY/MM/DD')
and TO_DATE('2022/07/31','YYYY/MM/DD') >= o.moodate;
