package com.x.proc.controller.t;

import com.baomidou.mybatisplus.service.IService;
import com.x.proc.controller.GenericController;
import com.x.proc.entity.t.TProduct;
import com.x.proc.service.IProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 07/02/2018
 * Time: 5:39 PM
 * ReMake: 商品管理
 */
@RestController
@RequestMapping(value = "/product")
public class ProductRestController extends GenericController<TProduct, Long> {

    @Resource
    private IProductService productService;

    @Override
    protected IService<TProduct> getService() {
        return this.productService;
    }
}
