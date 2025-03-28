<script setup>
import { useCssModule } from 'vue';
import styles from '@/assets/child4-style.module.css';

// const styles = useCssModule();
</script>

<template>
  <div :class="styles.child">
    <h2>Child4</h2>
  </div>
</template>

<!-- <style module src="@/assets/child4-style.module.css"></style> -->
