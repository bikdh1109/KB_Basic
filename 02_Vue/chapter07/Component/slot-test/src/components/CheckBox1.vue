<script setup>
import { ref } from 'vue';
const props = defineProps({
  id: String,
  checked: Boolean,
  label: String,
});

const emit = defineEmits(['check-changed']);

const handleChange = (e) => {
  const newChecked = e.target.checked;

  emit('check-changed', { id: props.id, checked: newChecked });
};
</script>

<template>
  <div>
    <input
      type="checkbox"
      :value="id"
      :checked="checked"
      @change="handleChange"
    />

    <span
      v-if="checked === true"
      style="color: blue; text-decoration: underline"
    >
      <i>{{ label }}</i>
    </span>
    <span v-else style="color: gray">{{ label }}</span>
  </div>
</template>

<style scoped></style>
