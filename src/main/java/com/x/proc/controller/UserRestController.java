package com.x.proc.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import com.x.proc.pojo.SysUser;
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
public class UserRestController {

    @Autowired
    private IUserService userService;

    // 创建线程安全的Map
//    static Map<Long, SysUser> users = Collections.synchronizedMap(new HashMap<Long, SysUser>());

    @GetMapping
    public Object getPageList(@RequestParam(value = "offset") int offset, @RequestParam(value = "limit") int limit ) {
//        List<SysUser> r = new ArrayList<SysUser>(users.values());
        JSONObject result = new JSONObject();
        Page<SysUser> page = new Page<>(offset, limit);
        page.setOrderByField("username").setAsc(false);
        page = userService.selectUserPage(page, 1);
        result.put("rows", page.getRecords());
        result.put("total", page.getTotal());
        return result;
    }

    @GetMapping(path = "/{id}")
    public Object getById(@PathVariable(value = "id") int id) {
        return userService.selectById(id);
    }

    @PostMapping(path = "/")
    public String post(@ModelAttribute SysUser user) {
//        userService.post(user);
        return "success";
    }
}
