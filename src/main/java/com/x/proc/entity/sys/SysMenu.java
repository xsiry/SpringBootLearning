package com.x.proc.entity.sys;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 23/01/2018
 * Time: 10:15 PM
 * ReMake: 系统菜单
 */
public class SysMenu extends Model<SysMenu> {

    private static final long serialVersionUID = 6537578713417549746L;

    private Long id;
    /**
     * 父ID
     */
    @TableField("parent_id")
    private Long parentId;
    /**
     * 树ID
     */
    @TableField("parent_ids")
    private String parentIds;
    /**
     * 菜单名称
     */
    private String name;
    /**
     * 排序
     */
    private Long sort;
    /**
     * 链接
     */
    private String href;
    /**
     * 图标
     */
    private String icon;
    /**
     * 是否显示
     * 1：显示 0：隐藏
     */
    private Boolean show;
    /**
     * 权限标识
     */
    private String permission;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 创建时间
     */
    private Date createAt;
    /**
     * 更新时间
     */
    private Date updateAt;
    /**
     * 删除标记
     * 1：删除 0：未删除
     */
    private String delFlag;

    @TableField(exist = false)
    private String parentName;
    /**
     * 是否是叶子节点
     */
    @TableField(exist = false)
    private Boolean leaf = true;
    /**
     * 子节点
     */
    @TableField(exist = false)
    private List<SysMenu> children = new ArrayList<>();

    /**
     * 添加子节点
     *
     * @param node 菜单节点
     */
    public void addChild(SysMenu node) {
        this.children.add(node);
    }


    public List<SysMenu> getChildren() {
        return children;
    }

    public void setChildren(List<SysMenu> children) {
        this.children = children;
    }


    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

}