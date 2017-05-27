package com.skyview.serviceTest;

import com.skyview.model.User;
import com.skyview.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * Created by yys on 2017/5/27.
 */
public class UserService {
    @Test
    public void testAddUser(){
        UserServiceImpl userService = new UserServiceImpl();
        User user = new User();
        user.setUsername("yys");
        user.setUsername("yys");
        userService.add(user);
    }
}
