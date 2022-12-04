package com.financier.system.utils;

import cn.hutool.captcha.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 验证码生成与验证工具
 * @author proteincode
 */
@Component
public class Captcha {

    /**
     * 验证码的宽度
     */
    @Value("${verification-code.width}")
    Integer width = 113;

    /**
     * 验证码高度
     */
    @Value("${verification-code.height}")
    Integer height = 39;

    /**
     * 验证码文本
     */
    String code;

    /**
     * base64 的验证码图片
     */
    String picture;


    /**
     * 声明线段干扰的验证码工具，定义长度为 113 高度为 39
     * 申请验证码，将文本和字节形式图片放在字段 code 和 picture 中
     */
    public void apply() {
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(width, height);
        Map<String, byte[]> result = new HashMap<>(1);
        this.picture = lineCaptcha.getImageBase64();
        this.code = lineCaptcha.getCode();
    }

    /**
     * 获取验证码文本
     * @return String
     */
    public String getCode() {
        return code;
    }

    /**
     * 获取图片的 byte[]
     * @return byte[]
     */
    public String getPicture() {
        return picture;
    }
}
