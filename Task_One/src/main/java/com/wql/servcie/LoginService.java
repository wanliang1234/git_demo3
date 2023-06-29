package com.wql.servcie;

import com.wql.domain.LoginPojo;
import org.springframework.transaction.annotation.Transactional;

public interface LoginService
{
    @Transactional
    LoginPojo getByid(LoginPojo loginPojo);
}
