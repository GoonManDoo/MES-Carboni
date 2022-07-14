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