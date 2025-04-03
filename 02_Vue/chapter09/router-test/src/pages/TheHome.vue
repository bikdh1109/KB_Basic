<script setup>
import { onMounted } from 'vue'
import { useRoute, useRouter } from 'vue-router'

const route = useRoute()
const router = useRouter()

const goBack = () => {
  router.go(-1)
}

onMounted(() => {
  console.log(route)
})
</script>

<template>
  <div class="card card-body">
    <h2>Home</h2>
    <p>요청 경로 : {{ route.fullPath }}</p>
    <button class="btn btn-secondary mt-2" @click="goBack">뒤로가기</button>
  </div>
</template>

<style scoped></style>
