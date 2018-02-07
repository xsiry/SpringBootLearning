package com.x.proc.entity.t;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 07/02/2018
 * Time: 4:47 PM
 */
public class TFactory extends Model<TFactory> {

    private static final long serialVersionUID = -4295199308475121609L;

    private Long id;
    /**
     * 厂商名称
     */
    private String name;
    /**
     * 总进货
     */
    private Integer inTotal;
    /**
     * 总出货
     */
    private Integer outTotal;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getInTotal() {
        return inTotal;
    }

    public void setInTotal(Integer inTotal) {
        this.inTotal = inTotal;
    }

    public Integer getOutTotal() {
        return outTotal;
    }

    public void setOutTotal(Integer outTotal) {
        this.outTotal = outTotal;
    }
}
