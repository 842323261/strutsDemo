package com.skyview.action;

import com.opensymphony.xwork2.ActionSupport;
import com.skyview.model.User;
import com.skyview.service.UserService;

/**
 * Created by yys on 2017/5/27.
 */
public class UserAction extends ActionSupport {
    private UserService userService;
    public String add(){
        User user = new User();
        user.setPassword("yys");
        user.setUsername("yys");
        userService.add(user);
        return "success";
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
