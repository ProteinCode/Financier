import axios from 'axios';
// 设置超时时间
axios.defaults.timeout = 5000;
axios.defaults.baseURL = 'http://localhost:8088';
interface Verify {
  get_capthca(): void;
  // imgData: string;
  uuid: string;
}
// 类实现 Verify 接口
export class RequestsService implements Verify {
  // 默认设置缺失图片
  image = '/src/assets/images/image-not-found.svg';
  // 当前uuid
  uuid = '';

  // 获取验证码的实现函数，返回验证码 base64 格式 
  async get_capthca() {
    // 使用 axios 请求后端的 api 并设置当前 imgData 的值
    await axios.get('/get_captcha').then((res)=>{ 
      //请求成功后
      this.getValue(res);
    });
  }

  getValue(one:any) {
    console.log(this.image);
    this.image = 'data:image/png;base64,'+one.data.captcha;
    console.log(this.image);
  }

}
