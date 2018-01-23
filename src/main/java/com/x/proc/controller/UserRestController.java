package com.x.proc.controller;

import com.x.proc.entity.SysUser;
import com.x.proc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 18/01/2018
 * Time: 4:55 PM
 * ReMake: 用户管理
 */

@RestController
@RequestMapping(path = "/user")
public class UserRestController extends GenericController<SysUser, Integer> {

    @Autowired
    private IUserService userService;

    @Override
    protected IUserService getService() {
        return userService;
    }
}
