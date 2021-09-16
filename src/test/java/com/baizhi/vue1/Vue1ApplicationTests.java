package com.baizhi.vue1;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Vue1ApplicationTests {
    @Autowired
        private UserDao userDao;
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
//        List<User> users = userDao.selectAll();
//        for (User user : users) {
//            System.out.println(user);
//        }
        System.out.println(userService.queryAll());
    }

}
