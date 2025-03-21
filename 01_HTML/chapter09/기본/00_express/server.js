const express = require('express');

const app = express();

app.get('/api/hello', (req, res) => {
  res.send('안녕하세요');
});
app.listen(3000, () => {
  console.log(`서버가 3000포트에서 실행중입니다...`);
});
