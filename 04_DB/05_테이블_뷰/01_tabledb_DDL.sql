drop database if exists tabledb;
create database tabledb;
use tabledb;

drop table if exists usertbl;
create table usertbl
(
    userID    char(8)     not null primary key,
    name      varchar(10) not null,
    birthyear int         not null,
    addr      char(2)     not null,
    mobile1   char(3),
    mobile2   char(8),
    height    smallint,
    mDate     date
);

drop table if exists buytbl;
create table buytbl
(
    name      int      not null primary key AUTO_INCREMENT,
    userID    char(8)  not null,
    prodName  char(6)  not null,
    groupName char(4),
    price     int      not null,
    amount    smallint not null,

-- FOREIGN KEY
    foreign key (userID) references usertbl (userID)
);


