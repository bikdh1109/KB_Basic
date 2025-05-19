use sqldb;

/*
    JOIN
    - 두개 이상의 테이블을 관련있는 컬럼을 통해서 결합하는데 사용
    - 반드시 연관있는 컬럼이 존재해야함
 */

-- 사용자별로 구매이력 출력
-- 모든 컬럼을 출력함
-- 구매 이력이 없는 정보는 출력하지 않음
select *
from buytbl buy
         inner join usertbl user
                    on buy.userID = user.userID;
-- using (userID);
-- USING : 컬럼명이 같을 경우 컬럼에 대한 조건을 작성해서 JOIN 가능

-- 앞의 결과에서 userID가 'JYP'인 데이터만 출력하세요.
select *
from buytbl buy
         inner join usertbl user
                    on buy.userID = user.userID
where buy.userID = 'JYP';

/* sqldb 데이터베이스에서 다음 조건을 처리하세요.
○ 각 사용자별로 구매 이력을 출력하세요.
○ 연결 컬럼은 userID로 함
○ 결과를 userID를 기준으로 오름차순으로 정렬함
○ 구매이력이 없는 사용자도 출력하세요.
○ userID, name, prodName, addr, 연락처를 다음과 같이 출력함 */

select user.userID, user.name, buy.prodName, user.addr, concat(user.mobile1, user.mobile2)
from usertbl user
         left outer join buytbl buy on user.userID = buy.userID
order by user.userID;

-- sqldb의 사용자를 모두 조회하되 전화가 없는 사람은 제외하고 출력하세요.
select *
from usertbl
where mobile1 is not null;

select *
from usertbl
where name not in (select name
                   from usertbl
                   where mobile1 is null);

-- sqldb의 사용자를 모두 조회하되 전화가 없는 사람만 출력하세요.
select *
from usertbl
where mobile1 is null;

/*
 UNION (합집합)
 - 두 쿼리의 결과를 하나의 RESULT로 합치는 것
 - 중복된 행이 결과에 포함되지 않음
 UNION ALL (합집합 + 교집합)
 - 중독된 행이 결과에 포함됨
 */
select name, addr, mobile1
from usertbl
where addr = '서울'
union all
select name, addr, mobile1
from usertbl
where mobile1 = '011';