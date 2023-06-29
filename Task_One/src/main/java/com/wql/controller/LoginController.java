package com.wql.controller;

import com.wql.domain.LoginPojo;
import com.wql.servcie.imp.LoginServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
@RequestMapping("/logins")
public class LoginController
{
    @Autowired
    private LoginServiceImp loginServiceImp;
    @PostMapping
    public LoginResult getByid(@RequestBody LoginPojo loginPojo, HttpServletRequest request, HttpServletResponse response)
    {
        LoginPojo byid = loginServiceImp.getByid(loginPojo);
        String msg;
        String token=null;
        if(null!=byid)
        {
            token= UUID.randomUUID().toString();
            //存入session以便做拦截器限制的时候比较
            HttpSession session = request.getSession();
            session.setAttribute("token",token);
            msg="登录成功";
        }else{
            msg="登录失败";
        }
        return new LoginResult(null!=byid?Code.post_OK:Code.put_ERR,msg,token);
    }
}
