<script setup>
import { useLikeStore } from '@/stores/likeStore';

const like = useLikeStore();
const { increase, reset } = like;
</script>

<template>
  <h2>좋아요 갯수 : {{ like.count }}</h2>
  <h2>좋아요 갯수 뻥튀기 {{ like.explosion }}</h2>
  <button @click="increase">좋아요</button>
  <button @click="reset">초기화</button>
</template>

<style scoped></style>
