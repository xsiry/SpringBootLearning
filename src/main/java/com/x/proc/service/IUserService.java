package com.x.proc.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.x.proc.entity.sys.SysUser;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 18/01/2018
 * Time: 4:44 PM
 * ReMake: 用户业务逻辑接口类
 */
public interface IUserService extends IService<SysUser> {
    /**
     * 用户登陆
     */
    SysUser login(SysUser user);
}
