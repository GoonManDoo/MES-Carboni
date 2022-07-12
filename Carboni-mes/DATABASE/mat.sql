--발주코드의 자재코드 외래키 
ALTER TABLE matord ADD CONSTRAINT fk_matinfo_to_matord_micode
FOREIGN KEY (MICODE) REFERENCES matinfo(MICODE);
--발주코드의 거래처 외래키 생성
ALTER TABLE matord ADD CONSTRAINT fk_matinfo_to_matord_cscode
foreign key (cscode) REFERENCES costomer(cscode);
--의뢰 번호 생성 
ALTER TABLE matord ADD CONSTRAINT FK_MATREQ_TO_MATORD_REQNUM
foreign key (REQNUM) REFERENCES MATREQ(REQNUM);


select e.reqnum,e.mrreqam,d.micode,d.miname
    from matreq e
    join matinfo d on e.micode=d.micode
    where d.micode='11';