package com.wql.servcie.imp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wql.dao.WorkDao;
import com.wql.domain.FyPojo;
import com.wql.domain.WorkPojo;
import com.wql.servcie.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImp implements WorkService
{
    @Autowired
    private WorkDao workDao;
    @Override
    public FyPojo getFy(int ye) {
        IPage page=new Page(ye,2);
        workDao.selectPage(page,null);
        FyPojo fyPojo=new FyPojo((int) page.getCurrent(), (List<WorkPojo>) page.getRecords(), (int) page.getPages(), (int) page.getSize(), (int) page.getTotal());
        return fyPojo;
    }

    @Override
    public List<WorkPojo> getLike(String zhi) {
        LambdaQueryWrapper<WorkPojo> lqw=new LambdaQueryWrapper<WorkPojo>();
        lqw.like(WorkPojo::getName,zhi);
        List<WorkPojo> workPojos = workDao.selectList(lqw);
        return workPojos;
    }
}
