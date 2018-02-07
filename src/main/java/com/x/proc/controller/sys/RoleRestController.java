package com.x.proc.controller.sys;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.IService;
import com.x.proc.controller.GenericController;
import com.x.proc.entity.sys.SysRole;
import com.x.proc.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    private IRoleService roleServic;

    @Override
    protected IService<SysRole> getService() {
        return roleServic;
    }

    /**
     * 非分页查询
     * @return Select 数据结构
     */
    @GetMapping(value = "/select")
    public Object select() {
        JSONObject result = new JSONObject();
        List<SysRole> sysRoleList =  roleServic.selectCom();
        result.put(SUCCESS, true);
        result.put("data", sysRoleList);
        return result;
    }
}
