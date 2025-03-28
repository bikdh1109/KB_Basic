<script setup>
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
    <slot>Item</slot>
  </div>
</template>

<style scoped></style>
