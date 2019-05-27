// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
// import axios from 'axios';
var axios = require('axios');


var urlpath = "http://localhost:8080/";
Vue.prototype.urlpath = urlpath
axios.defaults.headers.post['Content-Type'] = 'application/json';
Vue.config.productionTip = false
Vue.use(ElementUI);

axios.defaults.baseURL = 'api'
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
