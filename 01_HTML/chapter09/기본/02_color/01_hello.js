/* 이름을 함수의 매개변수로 전달받아 다음과 같이 출력하는 node 파일을 작성하고,
실행하세요. */

function hello(name) {
  const c = require('ansi-colors');

  console.log(c.green(name) + ' 님, 안녕하세요?');
}

hello('홍길동');
