import { defineStore } from 'pinia';
import { ref } from 'vue';

// Pinia 스토어 정의
export const useCounterStore = defineStore('counter', () => {
  //state
  const count = ref(0); // 카운터 값을 저장하는 상태 변수

  // getter

  // action
  // 1씩 증가시키는 메서드
  const increase = () => {
    count.value++;
  };

  //0으로 초기화 시키는 메서트
  const reset = () => {
    count.value = 0;
  };
  return { count, increase, reset };
});
