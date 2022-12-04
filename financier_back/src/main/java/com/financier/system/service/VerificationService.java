package com.financier.system.service;

import cn.hutool.json.JSONObject;
import com.financier.system.utils.Captcha;
import com.financier.system.utils.RedisUtil;
import com.financier.system.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 验证码的服务层，将结果提交给视图层
 * @author proteincode
 */
@Service
public class VerificationService {

    @Autowired
    Captcha captcha;

    @Autowired
    RedisUtil redisUtil;

    /**
     * 申请验证码，返回一个包含 uuid 和验证码的 JSONObject
     * @return
     */
    public JSONObject applyCaptcha() {
        String uuid = UUIDUtil.getUUID();
        captcha.apply();
        String nowCaptcha = captcha.getPicture();
        String code = captcha.getCode();
        redisUtil.set(uuid,code);
        JSONObject result = new JSONObject();
        result.set("captcha",nowCaptcha);
        result.set("uuid",uuid);
        return result;
    }
}
