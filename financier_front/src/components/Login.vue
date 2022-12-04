<template>
    <div class="form-part">
        <div class="account-part">
            <el-input v-model="account" class="w-50 m-2" size="large" placeholder="请输入账户" :prefix-icon="UserFilled"
                clearable />
        </div>
        <div class="passwd-part">
            <el-input v-model="password" type="password" placeholder="请输入密码" show-password :prefix-icon="Lock"
                size="large" clearable />
        </div>
        <div class="picture-part">
            <el-input class="picture-input" v-model="picture_num" placeholder="图形验证码" :prefix-icon="Key" size="large" @focus="checkTime" />
            <a class="picture-refresh" @click="getImage"><img class="picture" :src="imgData" /></a>
        </div>
        <div class="button-part">
            <el-button class="button" @click="login">立即登录</el-button>
        </div>
        <div class="forget">
            <a class="forget-passwd">忘记密码?</a>
        </div>
    </div>
</template>

<script lang="ts" setup>
import { ref } from 'vue';
import {
    UserFilled,
    Lock,
    Key
} from '@element-plus/icons-vue';
import { ElMessage, imageEmits } from 'element-plus';
// 导入自定义类
// import { RequestsService } from '../assets/ts/requests_service';
// 等待优化
import axios from 'axios';

// 初始化数据
let account = ref('');
let password = ref('');
let picture_num = ref('');

let imgData = ref('');
let timeRecord = ref(0);
//等待优化
get_capthca()

// 登录测试函数
function login() {
    ElMessage('this is a message.' + account.value);
}
// 等待优化
axios.defaults.timeout = 5000;
async function get_capthca() {
    // 使用 axios 请求后端的 api 并设置当前 imgData 的值
    await axios.get('http://localhost:8088/get_captcha').then((res) => {
        //请求成功后
        getValue(res);
    });
}
function getValue(one: any) {
    timeRecord.value = Date.parse(new Date().toString());
    imgData.value = 'data:image/png;base64,' + one.data.captcha;
} 
function getImage() {
    get_capthca();
}
function checkTime() {
    let nowTime = Date.parse(new Date().toString());
    if(nowTime - timeRecord.value >= 60000){
        get_capthca();
    }
}
</script>

<style scoped>
.form-part {
    padding: 10px;
    height: 330px;
}

.account-part {
    height: 40px;
    margin: 10px 5px;
}

.passwd-part {
    height: 40px;
    margin: 22px 5px 10px 5px;
}

.picture-part {
    height: 40px;
    margin: 22px 5px 10px 5px;
}

.picture-input {
    width: 50%;
    border: 0px;
    display: block;
    float: left;
}

.picture-refresh {
    width: 40%;
    height: 39px;
    display: block;
    float: right;
    cursor: pointer;
    display: flex;
    align-items: center;
    border-radius: 4px;
    margin-top: 1px;
    padding: 0 3px 0 3px;
    box-shadow: 0 0 0 1px var(--el-input-border-color, var(--el-border-color)) inset;
}

.picture {
    width: 110px;
    height: 36px;
    display: block;
}

.button-part {
    width: 100%;
    margin: 22px 5px 10px 5px;
}

.button {
    width: 98%;
    height: 40px;
}

.forget-passwd {
    display: block;
    float: right;
    cursor: pointer;
    font-size: 13px;
}
</style>
