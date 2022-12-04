<template>
<div class="verify-App">
    <header class="header">
        <div class="navbar-wrapper">
            <div class="header-container">
                <div class="logo-container">
                    <div class="logo-size">
                        <img src="../assets/images/financier-logo.svg" />
                    </div>
                </div>
            </div>
        </div>
    </header>
    <main class="main-div">
        <div class="hero-content">
            <div class="right-content">
                <div class="right-nav">
                    <el-tabs v-model="activeName" class="demo-tabs" @tab-click="handleClick">
                        <el-tab-pane label="登录" name="first">
                            <Login class="login" />
                        </el-tab-pane>
                        <el-tab-pane label="注册" name="second">Config</el-tab-pane>
                    </el-tabs>
                </div>
            </div>
        </div>
    </main>
    <footer>
        <span class="footer-content">—— Made with ❤️ by ProteinCode ——</span>
    </footer>
</div>
</template>

<script lang="ts" setup>
import Login from '../components/Login.vue'
import type {
    TabsPaneContext
} from 'element-plus'

const activeName = 'first'

const handleClick = (tab: TabsPaneContext, event: Event) => {
    console.log(tab, event)
}
</script>

<style scoped>
.demo-tabs>.el-tabs__content {
    padding: 32px;
    color: #6b778c;
    font-size: 32px;
    font-weight: 600;
}

.header {
    display: block;
    height: 3.5rem;
    width: 100%;
    border-bottom: 1px solid #dcdfe6;
    padding-left: 32px;
    padding-right: 12px;
    background-color: white;
}

.navbar-wrapper {
    padding: 0;
}

.logo-container {
    height: 55px;
    width: 128px;
    display: flex;
    align-items: center;
}

.logo-size {
    width: 128px;
    height: 28px;
    text-align: center;
}

.main-div {
    background-color: #6971d7;
}

.hero-content {
    padding: 40px 8rem 0 0;
    height: 32.5rem;
}

.right-content {
    display: block;
    float: right;
    height: 26rem;
    width: 24rem;
    background-color: white;
}

.right-nav {
    padding: 15px 35px 0px 35px;
}

div.el-input-group__append  {
    padding: 0;
}

footer {
    width: 100%;
    height: 85px;
    display: flex;
    align-items: center;
    margin: 0 auto;
    background-color: white;
}
.footer-content {
    width: 100%;
    text-align: center;
}

@media (min-width: 1290px) {
    .header {
        padding: 0 32px;
    }

    .main-div {
        padding-top: 55px;
    }

    .navbar-wrapper {
        padding: 0 32px;
    }

    .hero-content {
        padding: 40px 10rem 0 0;
        height: 32.5rem;
    }
}

@media (min-width: 950px) {
    .header {
        position: sticky;
        top: 0;
        left: 0;
        z-index: 11;
        padding-left: 32px;
        padding-right: 12px;
    }
}

@media (max-width: 750px) {
    .header {
        padding-left: 24px;
        padding-right: 12px;
    }

    .hero-content {
        padding: 30px 5px 0 5px;
        height: 35.5rem;
    }

    .right-content {
        margin: 0 45px;
    }
}

@media (max-width: 390px) {
    .header {
        padding-left: 24px;
        padding-right: 12px;
    }

    .hero-content {
        display: flex;
        align-items: center;
        max-width: 323px;
        padding: 30px 5px 0 5px;
        height: 35.5rem;
    }

    .right-content {
        float: none;
        margin: 0 45px;
    }
    
}
@media (max-width: 200px) {
    .account-input {
        margin: 10px 5px;
    }

    .passwd-input {
        margin: 10px 5px 10px 5px;
    }

    .picture-input {
        margin: 10px 5px 10px 5px;
    }

    .picture {
        margin-bottom: 10px;
    }

    .button {
        margin: 20px 5px 10px 5px;
    }

}
</style>
