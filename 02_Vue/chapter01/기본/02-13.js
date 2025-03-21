let obj = { result: 0 };
obj.add = function (x, y) {
  function inner() {
    this.result = x + y;
  }
  inner();
};
obj.add(3, 4);
console.log(obj);
console.log(result);

/* 
bind()
함수의 this 값을 특정 객체에 영구적으로 바인딩한 새로운 함수 반환
*/
