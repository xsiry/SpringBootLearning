package com.x.proc.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.x.proc.entity.sys.SysRole;
import com.x.proc.mapper.IRoleMapper;
import com.x.proc.service.IRoleServic;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 24/01/2018
 * Time: 9:17 PM
 */
@Service
public class RoleServiceImpl extends ServiceImpl<IRoleMapper, SysRole> implements IRoleServic{

}
