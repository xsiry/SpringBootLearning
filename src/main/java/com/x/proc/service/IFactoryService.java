package com.x.proc.service;

import com.baomidou.mybatisplus.service.IService;
import com.x.proc.entity.t.TFactory;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 07/02/2018
 * Time: 4:53 PM
 */
public interface IFactoryService extends IService<TFactory> {
    List<TFactory> selectCom();
}
