package com.x.proc.mapper;

import com.x.proc.SuperMapper;
import com.x.proc.entity.sys.SysRole;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 24/01/2018
 * Time: 9:12 PM
 */
public interface IRoleMapper extends SuperMapper<SysRole> {
    List<SysRole> selectCom();
}
