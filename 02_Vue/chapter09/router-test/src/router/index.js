import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: '/',

      component: () => import('@/pages/TheHome.vue'),
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('@/pages/TheAbout.vue'),
    },
    {
      path: '/members',
      name: 'memebers',
      component: () => import('@/pages/TheMembers.vue'),
    },
    {
      path: '/members/:id',
      component: () => import('@/pages/MemberInfo.vue'),
    },
    {
      path: '/videos',
      name: 'videos',
      component: () => import('@/pages/TheVideos.vue'),
    },
    {
      path: '/students',
      component: () => import('@/pages/TheStudents.vue'),
    },
  ],
})

export default router
