package com.x.proc.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 22/01/2018
 * Time: 4:11 PM
 */
public abstract class GenericController<ENTITY, PK extends Serializable> {

    private static final String SUCCESS = "success";

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected HttpServletRequest request;

    @Autowired
    protected HttpSession session;

    @Autowired
    protected ServletContext context;

    /**
     * 获取此Controller需要的服务类,由子类实现
     *
     * @return 通用服务类
     */
    protected abstract IService<ENTITY> getService();

    /**
     * 纯分页查询
     * @param offset 当前页
     * @param limit 每页显示条数
     * @return BootStrap Table 数据结构
     */
    @GetMapping(value = "/page")
    public Object page(@RequestParam(value = "offset") int offset, @RequestParam(value = "limit") int limit, @RequestParam(value = "sortname") String sortname, @RequestParam(value = "sortorder") String sortorder) {
        Page<ENTITY> page = new Page<>(offset, limit);
        JSONObject result = new JSONObject();
        page.setOrderByField(sortname).setAsc(sortorder.equals("asc"));
        page = getService().selectPage(page);
        result.put(SUCCESS, true);
        result.put("rows", page.getRecords());
        result.put("total", page.getTotal());
        return result;
    }

    /**
     * 单个对象查询
     * @param id 主键id
     * @return 单个对象结果
     */
    @GetMapping(value = "/{id}")
    public Object getById(@PathVariable(value = "id") PK id) {
        JSONObject result = new JSONObject();
        result.put(SUCCESS, true);
        result.put("data", getService().selectById(id));
        return result;
    }

    /**
     * 单个对象创建或更新
     * @param entity 请求操作的对象
     * @return 操作结果
     */
    @PostMapping
    public Object createOrUpdate(ENTITY entity) {
        JSONObject result = new JSONObject();
        try {
            getService().insertOrUpdate(entity);
            result.put(SUCCESS, true);
        }catch (Exception e) {
            result.put(SUCCESS, false);
            result.put("msg", e.getMessage());
        }
        return result;
    }

    /**
     * 单个对象删除
     * @param id 请求删除对象id
     * @return 操作结果
     */
    @DeleteMapping(value = "/{id}")
    public Object delete(@PathVariable(value = "id") PK id) {
        JSONObject result = new JSONObject();
        try {
            getService().deleteById(id);
            result.put(SUCCESS, true);
        }catch (Exception e) {
            result.put(SUCCESS, false);
            result.put("msg", e.getMessage());
        }
        return result;
    }
}
