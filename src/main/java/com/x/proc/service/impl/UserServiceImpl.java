package com.x.proc.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.x.proc.mapper.UserMapper;
import com.x.proc.pojo.Sys_User;
import com.x.proc.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 18/01/2018
 * Time: 4:46 PM
 * ReMake:  Sys_User表数据服务层接口实现类
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, Sys_User> implements IUserService {

    @Override
    public List<Sys_User> selectListBySQL() {
        return baseMapper.selectListBySQL();
    }

    public Page<Sys_User> selectUserPage(Page<Sys_User> page, Integer state) {
        return page.setRecords(baseMapper.selectUserList(page, state));
    }
}
