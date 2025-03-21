const d1 = new Date();
let name = '홍길동';
let r1 = `${name} 님에게 ${d1.toDateString()} `;
console.log(r1);
let product = '갤럭시S7';
let price = 199000;
let str = `${product}의 가격은
    ${price}원 입니다.`;
console.log(str);

/*
홍길동 님에게 Mon Jan 15 2024에 연락했다.
갤럭시S7의 가격은
199000원 입니다
*/
