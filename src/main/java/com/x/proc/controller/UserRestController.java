package com.x.proc.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import com.x.proc.pojo.Sys_User;
import com.x.proc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    private IUserService userService;

    // 创建线程安全的Map
//    static Map<Long, Sys_User> users = Collections.synchronizedMap(new HashMap<Long, Sys_User>());

    @GetMapping
    public Object getPageList(@RequestParam(value = "offset") int offset, @RequestParam(value = "limit") int limit ) {
//        List<Sys_User> r = new ArrayList<Sys_User>(users.values());
        JSONObject result = new JSONObject();
        Page<Sys_User> page = new Page<>(offset, limit);
        page.setOrderByField("username").setAsc(false);
        page = userService.selectUserPage(page, 1);
        result.put("rows", page.getRecords());
        result.put("total", page.getTotal());
        return result;
    }
    @PostMapping(path = "/")
    public String post(@ModelAttribute Sys_User user) {
//        userService.post(user);
        return "success";
    }
}
