use tabledb;

drop table if exists buytbl;
drop table if exists usertbl;

create table usertbl
(
    userID    char(8)     not null,
    name      varchar(10) not null,
    birthyear int         not null,

    -- constraint : 제약조건을 명시적으로 정의
    -- primary key 기본키제약조건이름(지정할 컬럼)
    constraint primary key PK_uerTBL_userID (userID)
);

drop table if exists prodTbl;
create table prodTbl
(
    prodCode char(3) not null,
    prodID   char(4) not null,
    prodDate DATETIME    not null,
    proCur   char(10),

    constraint primary key PK_prodTbl_prodCode_prodID(prodCode,prodID)
);

