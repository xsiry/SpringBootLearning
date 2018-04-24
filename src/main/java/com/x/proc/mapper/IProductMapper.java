package com.x.proc.mapper;

import com.baomidou.mybatisplus.plugins.Page;
import com.x.proc.SuperMapper;
import com.x.proc.entity.t.TProduct;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 07/02/2018
 * Time: 4:51 PM
 * ReMake: 厂商管理
 */
public interface IProductMapper extends SuperMapper<TProduct> {

    List<TProduct> pageProductList(Page<TProduct> page);
}
