//학생 데이터를 관리하는 컴포저블 함수
// 컴보저블 함수 -> 컴포넌트 내부에서 사용되는
// 함수를 외부에서 사용할 수 있도록 만드는 함수

import { ref } from 'vue'
import axios from '@/utils/axios'

export const useStudent = () => {
  const students = ref([])
  const error = ref(null)

  //전체 조회

  const fetchAllStudents = async () => {
    error.value = null
    try {
      const response = await axios.get('/students')
      console.log('response-----', response)
      students.value = response.data
    } catch (err) {
      error.value = err.message || '학생 데이터를 가져오는 중 에러'
      console.log(err)
    }
  }
  return { students, error, fetchAllStudents }
}
