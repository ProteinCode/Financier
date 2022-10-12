<template>
    <nav class="home-nav">
        <div style="width: 90%; margin: auto auto; ">
          <div class="nav_title" >
            <a  href="#">家庭财务系统</a>
          </div>
          <el-dropdown :hide-on-click="false" style="margin: 8.5px 0 0 0;float:right">
            <el-avatar :size="33">
              <img
                src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png"
              />
            </el-avatar>
            <template #dropdown>
              <el-dropdown-menu>
                <el-dropdown-item>
                  <el-icon><House /></el-icon>
                  个人中心
                </el-dropdown-item>
                  <el-dropdown-item disabled>
                    <el-icon><Operation /></el-icon>
                    管理用户
                  </el-dropdown-item>
                  <el-dropdown-item divided  @click="sign_off()">
                    <el-icon><SwitchButton /></el-icon>
                    退出
                  </el-dropdown-item>
                </el-dropdown-menu>
              </template>
          </el-dropdown>  
        </div>
    </nav>
</template>

<script>
import { useRouter } from 'vue-router';
export default {
  setup(){
    const $router = useRouter();
    const goLogin = () => {
      $router.push({path:'/login'})
    }
    return{
      goLogin
    }
  },
  data() {
    return {
    };
  },
  mounted(){
    this.init()
  },
  methods: {
    init(){},
    sign_off(){
      document.cookie=""
      this.$axios.post('/signOff')
      this.goLogin()
    }
  }
}
</script>

<style>
.flex-grow {
  flex-grow: 1;
}
.home-nav {
  background-color: #2287d6;
  height: 55px;
}
.nav_title a {
  color: white;
  float:left; 
  font-size: 25px; 
  /* margin-top: 11px; */
  line-height: 55px;
  text-decoration: none;
}

.nav_title a:hover {
  float:left; color: gold; 
}
</style>