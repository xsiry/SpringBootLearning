package com.x.proc.dao;

import com.x.proc.pojo.Sys_User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 18/01/2018
 * Time: 4:39 PM
 * ReMake: 用户类Dao接口
 */
public interface UserDao {
    /**
     * 查询所有用户
     */
    List<Sys_User> findAll();
}
