import { defineStore } from 'pinia';
import { ref, computed } from 'vue';

export const useLikeStore = defineStore('like', () => {
  const count = ref(0);

  const explosion = computed(() => count.value * 5);

  const increase = () => {
    count.value++;
  };

  const reset = () => {
    count.value = 0;
  };

  return { count, explosion, increase, reset };
});
