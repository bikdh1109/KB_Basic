<script setup>
import Child3 from './Child3.vue';
import { ref } from 'vue';

const slotName = ref('header');

const changeFooter = () => {
  slotName.value = 'footer';
};
const changeHeader = () => {
  slotName.value = 'header';
};
const changeDefault = () => {
  slotName.value = 'default';
};
</script>

<template>
  <div style="border: 5px solid red; padding: 10px">
    <Child3 :slot-name="slotName">
      <template #header>
        <p>헤더</p>
      </template>
      <template #default>
        <p>기본 슬롯</p>
      </template>
      <template #footer>
        <p>바닥글</p>
      </template>
    </Child3>
  </div>

  <button @click="changeHeader">슬롯 이름 header로 변경</button>
  <button @click="changeDefault">슬롯 이름 default로 변경</button>
  <button @click="changeFooter">슬롯 이름 footer로 변경</button>
</template>

<style scoped></style>
