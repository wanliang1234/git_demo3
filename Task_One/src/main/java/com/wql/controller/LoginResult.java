package com.wql.controller;

import lombok.Data;

@Data
public class LoginResult
{
    private Integer code;
    private String msg;
    private String token;

    public LoginResult(Integer code, String msg, String token) {
        this.code = code;
        this.msg = msg;
        this.token = token;
    }
}
