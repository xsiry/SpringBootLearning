package com.x.proc.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.x.proc.mapper.UserMapper;
import com.x.proc.entity.SysUser;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, SysUser> implements IUserService {

    @Override
    public List<SysUser> selectListBySQL() {
        return baseMapper.selectListBySQL();
    }

    public Page<SysUser> selectUserPage(Page<SysUser> page, Integer state) {
        return page.setRecords(baseMapper.selectUserList(page, state));
    }
}
