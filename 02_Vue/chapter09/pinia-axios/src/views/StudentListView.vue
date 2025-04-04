<script setup>
import StudentList from '@/components/StudentList.vue';
import StudentSummary from '@/components/StudentSummary.vue';
</script>

<template>
  <div>
    <h3>학생 수 Summary</h3>
    <StudentSummary />
    <h3>학생목록</h3>
    <StudentList />
  </div>
</template>

<style scoped></style>
