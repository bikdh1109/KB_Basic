<script setup>
// defineProps
// 부모 컴포넌트에서 전달받은 프로퍼티를 정의하는 함수
defineProps(['name', 'checked']);
</script>

<template>
  <li><input type="checkbox" :checked="checked" /> {{ name }}</li>
</template>

<style scoped></style>
