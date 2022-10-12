<template>
  <div style="float:left; width: 100%; background-color: #f3f3f3;float:left;">
    <TopNav/>
  </div>
  <div style="float:left; height: 100%; background-color:gold;">
    <besideMenu/>
  </div>
  <div style="float:left; height: 100%; width: 80%; margin-left: 56px; padding-left: 30px;">
    <div>
      <LineCharts/>
    </div>
  </div>
</template>

<script>
import { useRouter } from 'vue-router';
import besideMenu from "./components/BsideMenu.vue"
import TopNav from "./components/TopNav.vue"
import LineCharts from "./components/LineCharts.vue"
export default {
  setup(){
  },
  components: {
    besideMenu,
    TopNav,
    LineCharts
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
  }
}
</script>

<style>
body,
html {
  height: 100%;
  background-color: #f3f3f3;
}
</style>
