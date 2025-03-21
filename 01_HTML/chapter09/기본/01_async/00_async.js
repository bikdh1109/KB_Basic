/*
동기 작업 & 비동기 작업
*/

function sayhello() {
  console.log(`hello`);
}

sayhello();
sayhello();
setTimeout(sayhello, 3000);
console.log('end');
