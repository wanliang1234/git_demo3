package com.wql.servcie;

import com.wql.domain.FyPojo;
import com.wql.domain.WorkPojo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface WorkService
{
    @Transactional
    //分页查询
    FyPojo getFy(int ye);
    //条件查询(模糊查询名字)
    List<WorkPojo> getLike(String zhi);
}
