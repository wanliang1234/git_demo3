package com.wql.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wql.domain.LoginPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao extends BaseMapper<LoginPojo>
{

}
