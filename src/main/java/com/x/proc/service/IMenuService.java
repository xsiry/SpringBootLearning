package com.x.proc.service;

import com.baomidou.mybatisplus.service.IService;
import com.x.proc.entity.sys.SysMenu;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 24/01/2018
 * Time: 9:14 PM
 */
public interface IMenuService extends IService<SysMenu> {

    List<SysMenu> getMenuNav(Long id);

    List<SysMenu> getMenuTree(Long id);

    List<SysMenu> getMenuList(Long userId);
}
