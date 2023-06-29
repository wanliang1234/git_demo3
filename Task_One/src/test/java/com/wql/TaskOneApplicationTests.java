package com.wql;

import com.wql.domain.FyPojo;
import com.wql.domain.LoginPojo;
import com.wql.domain.WorkPojo;
import com.wql.servcie.imp.LoginServiceImp;
import com.wql.servcie.imp.WorkServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskOneApplicationTests {
    @Autowired
    private LoginServiceImp loginServiceImp;
    @Autowired
    private WorkServiceImp workServiceImp;

    @Test
    void contextLoads() {
        LoginPojo loginPojo=new LoginPojo();
        loginPojo.setUser("nh");
        loginPojo.setPassword("nh6");
        LoginPojo byid = loginServiceImp.getByid(loginPojo);
        System.out.println(byid);
    }
    //Work
    @Test
    void getFy_Work()
    {
        FyPojo fy = workServiceImp.getFy(1);
        System.out.println(fy);
    }
    @Test
    void getLike()
    {
        List<WorkPojo> z = workServiceImp.getLike("张");
        System.out.println(z);
    }

}
