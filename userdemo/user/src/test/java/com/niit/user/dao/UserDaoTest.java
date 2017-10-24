package com.niit.user.dao;

import com.niit.user.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void getAllUserInfo() throws Exception {
    }

    @Test
    public void getUserByNameAndPwd() throws Exception {
        User user=userDao.getUserByNameAndPwd("123","123");
        System.out.println(user);
    }

}