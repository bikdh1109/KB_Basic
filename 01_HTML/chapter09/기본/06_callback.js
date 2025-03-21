const order = (coffee, callback) => {
  console.log(`${coffee} 주문 접수`);

  setTimeout(() => {
    callback(coffee);
  }, 3000);
};

const display = (result) => {
  console.log(`${result} 완료!`);
};

order('아메리카노', display);

//콜백을 이용하여 다음과 같이 출력되도록 order 화살표 함수를 완성하세요.
