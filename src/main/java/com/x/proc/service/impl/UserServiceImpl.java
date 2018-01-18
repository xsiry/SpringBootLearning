package com.x.proc.service.impl;

import com.x.proc.dao.UserDao;
import com.x.proc.pojo.Sys_User;
import com.x.proc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 18/01/2018
 * Time: 4:46 PM
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<Sys_User> findAll() {
        return userDao.findAll();
    }
}
