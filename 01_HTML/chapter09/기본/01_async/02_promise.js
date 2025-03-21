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

console.log(increase(0));
increase(0)
  .then((number) => {
    console.log(number);
    return increase(number);
  })
  .then((number) => {
    console.log(number);
    return increase(number);
  })
  .then((number) => {
    console.log(number);
    return increase(number);
  })
  .then((number) => {
    console.log(number);
    return increase(number);
  })
  .then((number) => {
    console.log(number);
    return increase(number);
  })
  .catch((e) => {
    console.log(e, '가 발생했네...');
  })
  .finally(() => {
    console.log('finally 실행');
  });
