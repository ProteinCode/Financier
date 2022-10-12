package com.financier.system.controller;

import com.financier.system.service.user.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * Test my Controller.
 * It will delete by finished.
 * @author enrace
 */
@RestController
public class LoginController {

    @Autowired
    private Check checkLogin;

    @RequestMapping(value="/loginUser",method = RequestMethod.POST)
    public HashMap<String,Integer> queryUser(@RequestBody HashMap<String,String> params,
                                             HttpSession session){
        return checkLogin.checkLogin(params,session);
    }

    @RequestMapping(value="/loginStatus",method = RequestMethod.POST)
    public HashMap<String,Integer> loginStatus(HttpSession session) {
        HashMap<String,Integer> result = new HashMap<>();
        result.put("loginState",401);
        if( session.getAttribute("SESSION") != null){
            result.put("loginState",200);
        }
        return result;
    }

    @RequestMapping(value="/signOff",method = RequestMethod.POST)
    public void logOff(HttpSession session) {
        session.invalidate();
    }
}
