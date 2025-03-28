<script setup>
import Sibling1 from './components/01_problem/Sibling1.vue';
import Sibling2 from './components/01_problem/Sibling2.vue';
import { ref } from 'vue';

const sibiling2Message = ref('');

const handleMessageFromChild = (msg) => {
  sibiling2Message.value = msg;
};
</script>

<template>
  <div>
    <h2>mitt 없이 형제간 통신</h2>
    <Sibling1 @send-message="handleMessageFromChild" />
    <Sibling2 :message="sibiling2Message" />
  </div>
</template>

<style scoped></style>
