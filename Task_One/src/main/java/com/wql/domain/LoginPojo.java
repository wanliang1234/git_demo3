package com.wql.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("demo21")
public class LoginPojo
{
    private Integer id;
    private String user;
    private String password;
}
