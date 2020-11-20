package com.liql;

import com.liql.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public  void contextLoads() {
        System.out.println(userMapper.selectById(1));
    }

}
