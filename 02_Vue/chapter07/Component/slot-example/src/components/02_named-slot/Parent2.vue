<script setup>
import Child2 from './Child2.vue';
</script>

<template>
  <div style="border: 5px solid red; padding: 10px">
    <Child2>
      <template #header>
        <p>헤더</p>
      </template>
      <template #default>
        <p>기본 슬롯</p>
      </template>
      <template #footer>
        <p>바닥글</p>
      </template>
    </Child2>
  </div>
</template>

<style scoped></style>
