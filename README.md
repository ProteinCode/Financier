# Financier 家庭财务系统
## 整体描述

| 使用技术   |
| ---------- |
| Vue        |
| Element    |
| SpringBoot |
| MyBatis    |
| MySQL      |

## 登录模块

### SpringBoot 部分

* [x] 接收前端的账号和密码 
  * 前端提交的数据交给 service.user 下的 CheckLogin 进行逻辑判断返回 json 结果
  * 使用 MyBatis 读取数据库 role 表 username 字段和 password 字段进行校验
* [x] 返回判断结果是校验代码
* [x] MD5 加盐加密

  * 前端和后端采用相同盐加密格式。
  * [+] 数据请求中 Payload 含有密码 md5 加密结果，存在安全隐患。


* [x] 后端使用 session 验证用户登录
  * 使用 redis 缓存 session

### Vue 部分

* [x] main.js 进行 登录拦截
  * 在 router/index.js 中设置钩子函数，发送请求道 /loginStatus 判断登录状态。
* [x] cookie 销毁
  * signOff 请求后存在上一次 SESSION，存在不安全因素

## 主页模块

### SpringBoot 部分
* [ ] 读取数据库  bill 表获取支出和收入信息返回给前端
* [ ] 接收用户增删自己的支出/收入
* [ ] 接收管理员管理他人支出/收入 

### Vue 部分
* [ ] 采用侧面菜单栏的布局
* [ ] 主页分为两个子栏目家庭收入支出和个人收入支出

## 管理模块

### SpringBoot 部分
* [ ] 接收前端请求
* [ ] 更改数据库 role 表信息

### Vue 部分
* [ ] 显示用户信息
* [ ] 用户管理和提权

## ***\*项目接口\****

| 接口名称                 | 接口作用                       |
| ------------------------ | ------------------------------ |
| 127.0.0.1:9090/loginUser | 传入用户名和加密密码返回登录码 |
| 127.0.0.1:9090/signOff   | 退出用户登录状态               |
