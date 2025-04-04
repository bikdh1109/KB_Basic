<script setup>
import { useCounterStore } from '@/stores/counter';

const counter = useCounterStore();
</script>

<template>
  <div>
    <h3>{{ counter.count }}</h3>
    <button @click="counter.increase">+ 증가</button>
    <button @click="counter.reset">초기화</button>
  </div>
</template>

<style scoped></style>
