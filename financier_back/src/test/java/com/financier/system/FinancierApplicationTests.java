package com.financier.system;

import com.financier.system.utils.Captcha;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class FinancierApplicationTests {

    @Autowired
    Captcha captcha;

    @Test
    void contextLoads() {
        captcha.apply();
        System.out.println(captcha.getPicture());
    }

}
