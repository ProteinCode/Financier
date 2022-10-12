<template>
  <div class="left_menu" style="height:100%;">
    <el-menu
    default-active="2"
    class="el-menu-vertical-demo"
    :collapse="isCollapse"
    @open="handleOpen"
    @close="handleClose"
    background-color="#2287d6"
    text-color="#fff"
    style="height:100%"
  >
    <el-submenu index="1">
      <template #title>
        <el-icon class="nav-icon"><Odometer /></el-icon>
        <span style="font-size: 18px;">家庭支出</span>
      </template>
      <el-menu-item-group>
        <template #title><span>Group One</span></template>
        <el-menu-item index="1-1">item one</el-menu-item>
        <el-menu-item index="1-2">item two</el-menu-item>
      </el-menu-item-group>
      <el-menu-item-group title="Group Two">
        <el-menu-item index="1-3">item three</el-menu-item>
      </el-menu-item-group>
      <el-submenu index="1-4">
        <template #title><span>item four</span></template>
        <el-menu-item index="1-4-1">item one</el-menu-item>
      </el-submenu>
    </el-submenu>
    <el-menu-item index="2">
      <template #title>
        <el-icon class="nav-icon"><Finished /></el-icon>
        <span style="font-size: 18px;">个人支出</span>
      </template>
    </el-menu-item>
    <el-menu-item index="3" disabled>
      <el-icon class="nav-icon"><document /></el-icon>
      <template #title>上传支出</template>
    </el-menu-item>
    <el-menu-item index="4">
      <el-icon class="nav-icon"><setting /></el-icon>
      <template #title>关于我们</template>
    </el-menu-item>
    <el-icon style="font-size: 26px; color:white; margin-top: 30px;" @click="changeCollapse()"><Switch /></el-icon>
  </el-menu>
</div>
  
</template>
  
<script>
import { ref } from 'vue'
import {
  Document,
  Menu as IconMenu,
  Location,
  Setting,
} from '@element-plus/icons-vue'
export default {
  setup(){
    
    return {
    }
  },
  components: {
  },
  data() {
    return {
      isCollapse : false
    };
  },
  mounted(){
  
  },
  methods: {
    handleClose(){},
    handleOpen(){},
    changeCollapse(){
      this.isCollapse = !this.isCollapse
    }
  }
}

</script>

<style>
.el-menu-vertical-demo:not(.el-menu--collapse) {
  width: 250px;
  min-height: 400px;
}
.nav-icon {
  color:white;
  font-size: 23px;
}
.el-submenu__title i {
  color: white;
}
.el-menu-item i {
  color: white;
}
</style>
