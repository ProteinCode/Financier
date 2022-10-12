import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import installElementPlus from './plugins/element'
import axios from 'axios'
import md5 from 'js-md5'
import cookie from 'js-cookie'
import * as echarts from 'echarts';
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

const app = createApp(App)
installElementPlus(app)
app.use(router)
app.mount('#app')
app.config.globalProperties.$router = router
app.config.globalProperties.$axios = axios
app.config.globalProperties.$md5 = md5
app.config.globalProperties.$cookie = cookie

axios.defaults.baseURL = '/api'

app.config.globalProperties.echarts = echarts;

for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}