import axios from 'axios'

// axios 인스턴스 분리
// 공통된 설정을 한곳에서 처리
const instance = axios.create({
  baseURL: 'http://localhost:5000',

  // 서버 응답이 없을 때 대기하는 시간
  timeout: 5000,
})

export default instance
