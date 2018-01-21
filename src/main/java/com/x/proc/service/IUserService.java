package com.x.proc.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.x.proc.pojo.Sys_User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 18/01/2018
 * Time: 4:44 PM
 * ReMake: 用户业务逻辑接口类
 */
public interface IUserService extends IService<Sys_User> {
    /**
     * 查询用户列表
     */
    List<Sys_User> selectListBySQL();

    Page<Sys_User> selectUserPage(Page<Sys_User> page, Integer state);
}
