import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import department from '@/components/department'
import axios from 'axios'
Vue.prototype.axios = axios
Vue.use(Router)

export default new Router({
  routes: [
    {
      path:'/department',
      name:'department',
      component: department
    },
    {
      path: '/HelloWorld',
      name: 'HelloWorld',
      component: HelloWorld
    }
  ]
})
