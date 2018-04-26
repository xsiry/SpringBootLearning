package com.x.proc.controller.t;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.service.IService;
import com.x.proc.controller.GenericController;
import com.x.proc.entity.t.TFactory;
import com.x.proc.service.IFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    private IFactoryService factoryService;

    @Override
    protected IService<TFactory> getService() {
        return this.factoryService;
    }

    /**
     * 非分页查询
     * @return Select 数据结构
     */
    @GetMapping(value = "/select")
    public Object select() {
        JSONObject result = new JSONObject();
        List<TFactory> sysRoleList = factoryService.selectCom();
        result.put(SUCCESS, true);
        result.put("data", sysRoleList);
        return result;
    }
}
