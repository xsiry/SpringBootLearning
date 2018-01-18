package com.x.proc.controller;

import com.x.proc.pojo.Sys_User;
import com.x.proc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 18/01/2018
 * Time: 4:55 PM
 * ReMake: 用户管理
 */

@RestController
@RequestMapping(path = "/user")
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/findAll", method = RequestMethod.GET)
    public Object findAll() {
        List<Sys_User> list = userService.findAll();
        return list;
    }
}
