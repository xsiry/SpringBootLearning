package com.x.proc.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.x.proc.entity.t.TProduct;
import com.x.proc.mapper.IProductMapper;
import com.x.proc.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 07/02/2018
 * Time: 5:38 PM
 */
@Service
public class ProductServiceImpl extends ServiceImpl<IProductMapper, TProduct> implements IProductService {
    @Resource
    private IProductMapper productMapper;

    @Override
    public Page<TProduct> selectPage(Page<TProduct> page) {
        List<TProduct> list = productMapper.pageProductList(page);
        return page.setRecords(list);
    }
}
