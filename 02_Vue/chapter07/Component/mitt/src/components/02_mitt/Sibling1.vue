<script setup>
import { emitter } from '@/mitt';

const emit = defineEmits(['send-message']);

function sendMessage() {
  emitter.emit('send-message', 'Emitt 메세지 전송');
}
</script>

<template>
  <div style="border: 1px solid blue; padding: 10px">
    <h3>Sibling 1</h3>
    <button @click="sendMessage">Sibling2에게 메시지 보내기</button>
  </div>
</template>

<style scoped></style>
