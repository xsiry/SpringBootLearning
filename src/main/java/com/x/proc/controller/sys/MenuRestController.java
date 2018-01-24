package com.x.proc.controller.sys;

import com.baomidou.mybatisplus.service.IService;
import com.x.proc.controller.GenericController;
import com.x.proc.entity.sys.SysMenu;
import com.x.proc.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 24/01/2018
 * Time: 9:20 PM
 * ReMake: 菜单管理
 */
@RestController
@RequestMapping(value = "/menu")
public class MenuRestController extends GenericController<SysMenu, Long> {

    @Autowired
    private IMenuService menuService;

    @Override
    protected IService<SysMenu> getService() {
        return menuService;
    }


    /**
     * 初始化菜单
     */
    @GetMapping(value = "/nav")
    public List<SysMenu> getMenuNav() {
        return menuService.getMenuNav((long) 1);
    }

    /**
     * Gets menu tree.
     *
     * @return the menu tree
     */
    @GetMapping(value = "/tree")
    public List<SysMenu> getMenuTree() {
        return menuService.getMenuTree((long) 1);
    }

    /**
     * Gets menu list.
     *
     * @return the menu list
     */
    @GetMapping(value = "/list")
    public List<SysMenu> getMenuList() {
        return menuService.getMenuList((long) 1);
    }

}
