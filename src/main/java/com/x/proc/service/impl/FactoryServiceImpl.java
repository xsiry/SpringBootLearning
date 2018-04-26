package com.x.proc.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.x.proc.entity.t.TFactory;
import com.x.proc.mapper.IFactoryMapper;
import com.x.proc.service.IFactoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 07/02/2018
 * Time: 4:54 PM
 */
@Service
public class FactoryServiceImpl extends ServiceImpl<IFactoryMapper, TFactory> implements IFactoryService {

    @Override
    public List<TFactory> selectCom() {
        return baseMapper.selectCom();
    }
}
