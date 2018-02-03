package com.x.proc.controller.sys;

import com.alibaba.fastjson.JSONObject;
import com.x.proc.controller.GenericController;
import com.x.proc.entity.sys.SysUser;
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
public class UserRestController extends GenericController<SysUser, Long> {

    @Autowired
    private IUserService userService;

    @Override
    protected IUserService getService() {
        return userService;
    }

    @RequestMapping(value = "/login")
    public Object login(@ModelAttribute SysUser user){
        SysUser quser = userService.login(user);
        JSONObject result = new JSONObject();
        if (quser != null) {
            session.setAttribute("login", user);
            result.put(SUCCESS, true);
            result.put("msg", "登陆成功！");
        } else {
            result.put(SUCCESS, false);
            result.put("msg", "用户名或密码错误！");
        }

        return result;
    }
}
