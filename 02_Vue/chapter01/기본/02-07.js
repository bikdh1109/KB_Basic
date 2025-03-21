let arr = [10, 20, 30, 40];
let [a1, a2, a3] = arr;
console.log(a1, a2, a3);
let p1 = { name: '홍길동', age: 20, gender: 'M' };
let { name: n, age: a, gender } = p1;
console.log(n, a, gender);

/* 
1. 기본적인 구조분해할당
let arr = [1,2,3,4]
let [a1, a2, a3] = arr

2. 일부 요소 건너뛰기
let [,a2,,a4] = arr

3. 기본값 설정
let [a1, a2, a3, a4, a5 = "5", a6 = '6']

4. 중첩된 배열 구조 분해
const nestedArray = [1, [2,3], 4]
const [num1, numArr, num2] = nestedArray -> 1 [2,3] 4
const [num1, [num2, num3], num4] = nestedArray -> 1 2 3 4
*/

/*
객체 구조분해 할당
1. key 값 할당
const user = { name: 'hong', age = 20 }
const { name, age } = user

2. 변수 이름 변경
const {name : n, age: a} = user

3. 기본값 설정
const {salary = 5000, age: userAge=30} = user
*/
// 4. 중첩된 객체 구조 분해
const person = {
  name2: 'Bob',
  info: {
    address: 'Seoul',
    hobby: ['reading', 'coding'],
  },
};

const {
  name2,
  info: {
    address,
    hobby: [firsthobby, secondhobby],
  },
} = person;

console.log(firsthobby);
