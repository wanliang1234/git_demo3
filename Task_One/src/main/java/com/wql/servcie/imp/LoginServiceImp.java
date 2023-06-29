package com.wql.servcie.imp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wql.dao.LoginDao;
import com.wql.domain.LoginPojo;
import com.wql.servcie.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService
{
    @Autowired
    private LoginDao loginDao;
    @Override
    public LoginPojo getByid(LoginPojo loginPojo) {
        LambdaQueryWrapper<LoginPojo> lqw=new LambdaQueryWrapper<LoginPojo>();
        lqw.eq(LoginPojo::getUser,loginPojo.getUser()).eq(LoginPojo::getPassword,loginPojo.getPassword());
        LoginPojo loginPojo1 = loginDao.selectOne(lqw);
        return loginPojo1;
    }
}
