<script setup>
import TheCounter from './components/TheCounter.vue';
import TheLike from './components/TheLike.vue';
import { useCounterStore } from './stores/counter';
import { useLikeStore } from './stores/likeStore';

const counter = useCounterStore();

const like = useLikeStore();
const { increase, reset } = like;
</script>

<template>
  <div>
    <h1>Pinia 상태관리 예제</h1>
    <hr />
    <TheLike />
    <hr />
    <h2>APP에서 보는 Counter : {{ counter.count }}</h2>
    <TheCounter />
  </div>
</template>

<style scoped></style>
