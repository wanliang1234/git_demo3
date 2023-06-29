package com.wql.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("demo18")
public class WorkPojo
{
    private Integer id;
    private String name;
    @TableField(value = "zhuanYe")
    private String zhuanYe;
    @TableField(value = "zhuangTai")
    private Integer zhuangTai;
}
