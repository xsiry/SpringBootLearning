package com.x.proc.controller.t;

import com.baomidou.mybatisplus.service.IService;
import com.x.proc.controller.GenericController;
import com.x.proc.entity.t.TFactory;
import com.x.proc.service.IFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 07/02/2018
 * Time: 4:57 PM
 * ReMake: 厂商管理
 */
@RestController
@RequestMapping(value = "/factory")
public class FactoryRestController extends GenericController<TFactory, Long> {

    @Autowired
    private IFactoryService factoryService;

    @Override
    protected IService<TFactory> getService() {
        return this.factoryService;
    }
}
