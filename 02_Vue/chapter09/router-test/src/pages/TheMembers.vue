<script setup>
import members from '@/members.json'
import { onMounted } from 'vue'

onMounted(() => {
  console.log(members)
})
</script>

<template>
  <div class="card card-body">
    <h2>Memebers</h2>
    <div v-for="member in members" :key="member.id">
      <RouterLink :to="'/members/' + member.id">
        <img
          class="img-thumbnail"
          style="width: 90px; height: 110px"
          :src="member.photo"
          :title="member.name"
        />
        <h6 class="display-7">{{ member.name }}</h6>
      </RouterLink>
    </div>
  </div>
</template>

<style scoped></style>
