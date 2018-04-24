package com.x.proc.entity.t;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 07/02/2018
 * Time: 4:47 PM
 */
public class TFactory extends Model<TFactory> {

    private static final long serialVersionUID = -4295199308475121609L;

    private int id;
    /**
     * 厂商名称
     */
    private String factoryName;
    /**
     * 总进货
     */
    private int inTotal;
    /**
     * 总出货
     */
    private int outTotal;

    @TableField(exist = false)
    private List<TProduct> products; // 拥有产品

    public TFactory() {

    }

    public TFactory(int id, String factoryName, int inTotal, int outTotal, List<TProduct> products) {
        this.id = id;
        this.factoryName = factoryName;
        this.inTotal = inTotal;
        this.outTotal = outTotal;
        this.products = products;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInTotal() {
        return inTotal;
    }

    public void setInTotal(int inTotal) {
        this.inTotal = inTotal;
    }

    public int getOutTotal() {
        return outTotal;
    }

    public void setOutTotal(int outTotal) {
        this.outTotal = outTotal;
    }

    public List<TProduct> getProducts() {
        return products;
    }

    public void setProducts(List<TProduct> products) {
        this.products = products;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }
}
