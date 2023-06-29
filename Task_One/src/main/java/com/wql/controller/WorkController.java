package com.wql.controller;

import com.wql.domain.FyPojo;
import com.wql.domain.WorkPojo;
import com.wql.servcie.imp.WorkServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/works")
public class WorkController
{
    @Autowired
    private WorkServiceImp workServiceImp;
    @GetMapping("/{ye}")
    public Result getFy(@PathVariable int ye)
    {
        FyPojo fy = workServiceImp.getFy(ye);
        String msg;
        if(null!=fy)
        {
            msg="查询成功";
        }else {
            msg="查询失败";
        }
        return new Result(null!=fy?Code.Get_OK:Code.Get_ERR,msg,fy);
    }

    @PostMapping
    public Result getLike(@RequestBody String name)
    {
        List<WorkPojo> like = workServiceImp.getLike(name);
        String msg;
        if(null!=like)
        {
            msg="查询成功";
        }else {
            msg="查询失败";
        }
        return new Result(null!=like?Code.Get_OK:Code.Get_ERR,msg,like);
    }
}
