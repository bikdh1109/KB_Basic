<template>
  <nav class="navbar navbar-expand-md bg-dark navbar-dark mt-2">
    <span class="navbar-brand"> 이 날 치(LeeNalChi)</span>
    <button class="navbar-toggler" type="button" @click="changeIsNavShow">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div :class="navClass">
      <ul class="navbar-nav">
        <li class="nav-item">
          <RouterLink class="nav-link" to="/"> 홈</RouterLink>
        </li>
        <li class="nav-item">
          <RouterLink class="nav-link" to="/about"> 소 개</RouterLink>
        </li>
        <li class="nav-item">
          <RouterLink class="nav-link" to="/members"> 멤 버</RouterLink>
        </li>
        <li class="nav-item">
          <RouterLink class="nav-link" to="/videos"> 영 상</RouterLink>
        </li>
        <li class="nav-item">
          <RouterLink class="nav-link" to="/students"> 학 생</RouterLink>
        </li>
      </ul>
    </div>
  </nav>
</template>
<script setup>
import { reactive, computed } from 'vue'

const state = reactive({ isNavShow: false })
const navClass = computed(() =>
  state.isNavShow ? 'collapse navbar-collapse show' : 'collapse navbar-collapse',
)
const changeIsNavShow = () => {
  state.isNavShow = !state.isNavShow
}
</script>
