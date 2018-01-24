package com.x.proc.entity.sys;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 24/01/2018
 * Time: 9:00 PM
 * ReMake: 角色菜单关系
 */
public class SysRoleMenu extends Model<SysRoleMenu> {

    private static final long serialVersionUID = 8223007200074440855L;

    private Long id;
    /**
     * 角色ID
     */
    @TableField("role_id")
    private Long roleId;
    /**
     * 菜单ID
     */
    @TableField("menu_id")
    private Long menuId;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    @Override
    protected Serializable pkVal() {
        return this.roleId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}