<template>
  <el-affix :offset="0">
    <nav class="home-nav">
        <div style="width: 70%; margin: auto auto">
          <div style="float:left; color: white; font-size: 25px; margin-top: 11px;">
            <a href="#">Home</a>
          </div>
          <el-dropdown :hide-on-click="false" style="margin: 8.5px 0 0 0;float:right">
            <el-avatar :size="33" src="https://empty" @error="errorHandler">
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
                  <el-dropdown-item divided>
                    <el-icon><SwitchButton /></el-icon>
                    退出
                  </el-dropdown-item>
                </el-dropdown-menu>
              </template>
          </el-dropdown>  
        </div>
    </nav>
  </el-affix>
</template>

<script setup>
import { ref } from 'vue'

</script>

<style>
.flex-grow {
  flex-grow: 1;
}
.home-nav {
  background-color: #2287d6;
  height: 55px;
}
</style>
