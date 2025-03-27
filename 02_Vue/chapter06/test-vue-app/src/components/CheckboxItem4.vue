<script setup>
defineProps({
  idol: {
    type: Object,
    required: true,
    validator: (value) => {
      return (
        (typeof value.id === 'number' || typeof value.id === 'string') &&
        typeof value.name === 'string' &&
        typeof value.checked === 'boolean'
      );
    },
  },
});
</script>

<template>
  <li><input type="checkbox" :checked="idol.checked" /> {{ idol.name }}</li>
</template>

<style scoped></style>
