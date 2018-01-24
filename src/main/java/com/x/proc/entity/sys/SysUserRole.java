package com.x.proc.entity.sys;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 24/01/2018
 * Time: 9:02 PM
 * ReMake: 用户角色关系
 */
public class SysUserRole extends Model<SysUserRole> {

    private static final long serialVersionUID = 847963187513039181L;

    private Long id;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 角色ID
     */
    @TableField("role_id")
    private Long roleId;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}