package com.x.proc.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.x.proc.SuperMapper;
import com.x.proc.pojo.SysUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 19/01/2018
 * Time: 6:09 PM
 */
public interface UserMapper extends SuperMapper<SysUser> {

    @Select("select * from sys_user")
    List<SysUser> selectListBySQL();

    /**
     * <p>
     * 查询 : 根据state状态查询用户列表，分页显示
     * </p>
     *
     * @param page
     *            翻页对象，可以作为 xml 参数直接使用，传递参数 Page 即自动分页
     * @param state
     *            状态
     * @return
     */
    List<SysUser> selectUserList(Pagination page, Integer state);
}
