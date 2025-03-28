<script setup>
import Parent from './components/01_slot-basic/Parent.vue';
import Parent2 from './components/02_named-slot/Parent2.vue';
import Parent3 from './components/03_dynamic-slot/Parent3.vue';
import Parent4 from './components/04_scoped-slot/Parent4.vue';
</script>

<template>
  <div>
    <Parent />
    <Parent2 />
    <Parent3 />
    <Parent4 />
  </div>
</template>

<style scoped></style>
