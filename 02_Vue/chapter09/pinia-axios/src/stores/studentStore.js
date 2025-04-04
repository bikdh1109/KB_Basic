import { defineStore } from 'pinia';
import { computed, ref } from 'vue';
import apiClient from '@/utils/axios';

export const useStudentStore = defineStore('studentStore', () => {
  //상태
  const students = ref([]);

  // action
  const fetchStudents = async () => {
    try {
      const response = await apiClient.get('/students');
      students.value = response.data;
    } catch (err) {
      console.log('학생정보 로딩 에러: ', err);
    }
  };

  // getter
  const studentCount = computed(() => students.value.length);

  return { students, fetchStudents, studentCount };
});
