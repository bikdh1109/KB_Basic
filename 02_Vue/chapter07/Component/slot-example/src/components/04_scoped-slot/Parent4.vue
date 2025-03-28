<script setup>
import Child4 from './Child4.vue';
</script>

<template>
  <div style="border: 5px solid red; padding: 10px">
    <Child4 v-slot:item="{ item }">
      <h3>{{ item.name }}</h3>
    </Child4>
  </div>
</template>

<style scoped></style>
