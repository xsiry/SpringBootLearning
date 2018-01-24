package com.x.proc.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.x.proc.entity.sys.SysMenu;
import com.x.proc.entity.sys.SysUser;
import com.x.proc.mapper.IMenuMapper;
import com.x.proc.service.IMenuService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 24/01/2018
 * Time: 9:15 PM
 */
@Service
public class MenuServiceImpl extends ServiceImpl<IMenuMapper, SysMenu> implements IMenuService {

    @Override
    public List<SysMenu> getMenuNav(Long userId) {
        return makeTree(getMenuListByUserId(userId), true);
    }


    @Override
    public List<SysMenu> getMenuTree(Long userId) {
        return makeTree(getMenuListByUserId(userId), false);
    }


    @Override
    public List<SysMenu> getMenuList(Long userId) {
        List<SysMenu> resultList = new ArrayList<>();
        sortList(resultList, getMenuListByUserId(userId), (long) 0);
        return resultList;
    }

    /**
     * 按父子顺序排列菜单列表
     *
     * @param list       目标菜单列表
     * @param sourceList 原始菜单列表
     * @param parentId   父级编号
     */
    private void sortList(List<SysMenu> list, List<SysMenu> sourceList, Long parentId) {
        sourceList.stream()
                .filter(menu -> menu.getParentId() != null && menu.getParentId().equals(parentId))
                .forEach(menu -> {
                    list.add(menu);
                    // 判断是否还有子节点, 有则继续获取子节点
                    sourceList.stream()
                            .filter(child -> child.getParentId() != null && child.getParentId().equals(menu.getId()))
                            .peek(child -> sortList(list, sourceList, menu.getId()))
                            .findFirst();
                });
    }

    /**
     * 获得用户菜单列表，超级管理员可以查看所有菜单
     *
     * @param userId 用户ID
     * @return 菜单列表
     */
    private List<SysMenu> getMenuListByUserId(Long userId) {
        List<SysMenu> menuList;
        //超级管理员
        if (SysUser.ADMIN_USER_ID == userId) {
            menuList = baseMapper.selectList(new EntityWrapper<SysMenu>().orderBy("sort"));
        } else {
            menuList = baseMapper.findListByUserId(userId);
        }
        return menuList;
    }

    /**
     * 构建树形结构
     *
     * @param originals 原始数据
     * @param useShow   是否使用开关控制菜单显示隐藏
     * @return 菜单列表
     */
    private List<SysMenu> makeTree(List<SysMenu> originals, boolean useShow) {

        // 构建一个Map,把所有原始数据的ID作为Key,原始数据对象作为VALUE
        Map<Long, SysMenu> dtoMap = new LinkedHashMap<>();
        for (SysMenu node : originals) {
            // 原始数据对象为Node，放入dtoMap中。
            Long id = node.getId();
            if (node.getShow() || !useShow) {
                dtoMap.put(id, node);
            }
        }

        List<SysMenu> result = new ArrayList<>();
        for (Map.Entry<Long, SysMenu> entry : dtoMap.entrySet()) {
            SysMenu node = entry.getValue();
            Long parentId = node.getParentId();
            if (dtoMap.get(parentId) == null) {
                // 如果是顶层节点，直接添加到结果集合中
                result.add(node);
            } else {
                // 如果不是顶层节点，有父节点，然后添加到父节点的子节点中
                SysMenu parent = dtoMap.get(parentId);
                parent.addChild(node);
                parent.setLeaf(false);
            }
        }

        return result;
    }

}
