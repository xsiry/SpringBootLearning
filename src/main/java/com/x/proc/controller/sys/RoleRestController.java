package com.x.proc.controller.sys;

import com.baomidou.mybatisplus.service.IService;
import com.x.proc.controller.GenericController;
import com.x.proc.entity.sys.SysRole;
import com.x.proc.service.IRoleServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 24/01/2018
 * Time: 9:11 PM
 * ReMake: 角色管理
 */
@RestController
@RequestMapping(value = "/role")
public class RoleRestController extends GenericController<SysRole, Long> {

    @Autowired
    private IRoleServic roleServic;

    @Override
    protected IService<SysRole> getService() {
        return roleServic;
    }
}
