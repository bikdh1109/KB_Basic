<script setup>
import { ref } from 'vue';

const childName = ref('');

const emit = defineEmits(['nameChange']);
</script>

<template>
  <div>
    이름 : <input type="text" v-model.trim="childName" />
    <button @click="emit('nameChange', { childName })">이벤트 발신</button>
  </div>
</template>

<style scoped></style>
