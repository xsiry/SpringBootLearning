package com.x.proc.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.x.proc.mapper.IUserMapper;
import com.x.proc.entity.sys.SysUser;
import com.x.proc.service.IUserService;
import com.x.proc.utils.AppHelper;
import org.springframework.stereotype.Service;
import sun.security.provider.MD5;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 18/01/2018
 * Time: 4:46 PM
 * ReMake:  Sys_User表数据服务层接口实现类
 */

@Service
public class UserServiceImpl extends ServiceImpl<IUserMapper, SysUser> implements IUserService {

    @Override
    public SysUser login(SysUser user) {
        try {
            user.setPassword(AppHelper.MD5(user.getPassword()));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return baseMapper.selectOne(user);
    }
}
