package com.x.proc.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.x.proc.SuperMapper;
import com.x.proc.entity.sys.SysUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 19/01/2018
 * Time: 6:09 PM
 */
public interface IUserMapper extends SuperMapper<SysUser> {

    /**
     * <p>
     * 用户登陆查询
     * </p>
     *
     * @param user
     *            用户对象
     * @return
     */
    SysUser login(SysUser user);
}

