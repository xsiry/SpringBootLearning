package com.x.proc.mapper;

import com.x.proc.SuperMapper;
import com.x.proc.entity.sys.SysMenu;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 24/01/2018
 * Time: 9:13 PM
 */
public interface IMenuMapper extends SuperMapper<SysMenu> {

    List<SysMenu> findListByUserId(Long userId);
}
