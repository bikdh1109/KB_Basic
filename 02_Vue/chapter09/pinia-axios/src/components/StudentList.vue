<script setup>
import { onMounted } from 'vue';
import { useStudentStore } from '@/stores/studentStore';
import StudentInfo from './StudentInfo.vue';

const studentStore = useStudentStore();

onMounted(() => {
  studentStore.fetchStudents();
});
</script>

<template>
  <div>
    <ul class="student-list">
      <li
        v-for="student in studentStore.students"
        :key="student.id"
        class="student-item"
      >
        <StudentInfo :student="student"></StudentInfo>
      </li>
    </ul>
  </div>
</template>

<style scoped></style>
