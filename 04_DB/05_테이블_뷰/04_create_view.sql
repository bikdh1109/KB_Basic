use tabledb;

/*
    VIEW
    - 실제 데이터를 저장하지 않고, 하나 이상의 테이블을 조회하는 select 문을
    가상의 테이블처럼 사용하는 객체
    - 자주 사용하는 select 쿼리를 재사용 할 수 있게 해줌
    - 보안, 편의성, 유지보수성을 높여줌
    - 복잡한 쿼리의 view 테이블을 사용할 경우 성능 하락
    - 참조하던 테이블이 삭제되면 VIEW가 깨질 수 있어, VIEW를 먼저 삭제하는 것을 권장함

    create view 뷰이름 as
    [select 문]
 */

create view userView
as
select u.userID, u.name, b.prodName, u.addr, concat(u.mobile1, u.mobile2) as "연락처"
from usertbl u
         inner join buytbl b on u.userID = b.userID;

select *
from userView
where name = '김범수';
