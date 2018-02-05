package com.x.proc.service;

import com.baomidou.mybatisplus.service.IService;
import com.x.proc.entity.sys.SysRole;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 24/01/2018
 * Time: 9:17 PM
 */
public interface IRoleServic extends IService<SysRole> {

    public List<SysRole> selectCom();
}
