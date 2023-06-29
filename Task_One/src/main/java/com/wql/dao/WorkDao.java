package com.wql.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wql.domain.WorkPojo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkDao extends BaseMapper<WorkPojo>
{

}
