package com.financier.system.controller;

import cn.hutool.json.JSONObject;
import com.financier.system.service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class VerificationController {

    @Autowired
    VerificationService verificationService;

    @RequestMapping(value="/get_captcha",method = RequestMethod.GET)
    public JSONObject getCaptcha() {
       return verificationService.applyCaptcha();
    }

}
