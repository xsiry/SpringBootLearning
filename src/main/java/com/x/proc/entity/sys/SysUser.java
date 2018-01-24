package com.x.proc.entity.sys;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.x.proc.entity.enums.GenderEnum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 18/01/2018
 * Time: 4:29 PM
 * Remake: 系统用户
 */
public class SysUser extends Model<SysUser>{

    private static final long serialVersionUID = -5561042921085738334L;

    /**
     * 超级管理用户ID
     */
    public static final long ADMIN_USER_ID = 1;

    private Long id; // 用户id
    private Long roleId; // 角色id
    private String username; // 用户名
    private String password; // 密码
    private String relName; // 真是姓名
    private GenderEnum gender; // 性别
    private String mobile; // 电话
    private String idCard; // 身份证号
    private Date createdAt; // 创建时间
    private Date updateAt; // 更新时间
    private String state; // 状态
    private String delFlag; // 删除标记 1：删除 0：未删除

    /**
     * 角色列表
     */
    @TableField(exist = false)
    private List<SysRole> roles = new ArrayList<>();

    @TableField(exist = false)
    private String roleIds;
    /**
     * 菜单列表
     */
    @TableField(exist = false)
    private List<SysMenu> menus = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRelName() {
        return relName;
    }

    public void setRelName(String relName) {
        this.relName = relName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }

    public List<SysMenu> getMenus() {
        return menus;
    }

    public void setMenus(List<SysMenu> menus) {
        this.menus = menus;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
