function increase(number) {
  const promise = new Promise((resolve, reject) => {
    setTimeout(() => {
      const result = number + 10;

      if (result > 50) {
        const e = new Error('NumberTooBig');

        return reject(e);
      }

      resolve(result);
    }, 1000);
  });

  return promise;
}

async function run() {
  try {
    let result = await increase(0);
    console.log(result);

    result = await increase(result);
    console.log(result);
    result = await increase(result);
    console.log(result);
    result = await increase(result);
    console.log(result);
    result = await increase(result);
    console.log(result);
    result = await increase(result);
    console.log(result);
  } catch (e) {
    console.log(e, ' 가 발생했네');
  }
}

run();

/*
    await : promise 객체에 담긴 resolve 결과를 반환해준다.
    await가 달린 비동기 처리들을 동기식으로 동작하게 해준다.
*/
