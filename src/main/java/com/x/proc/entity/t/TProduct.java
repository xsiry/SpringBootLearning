package com.x.proc.entity.t;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 07/02/2018
 * Time: 5:32 PM
 */
public class TProduct extends Model<TFactory> {

    private static final long serialVersionUID = -5332553974926111150L;

    private Long id;

    /**
     * 名称
     */
    private String productName;
    /**
     * 型号
     */
    private String core;
    /**
     * 单价
     */
    private double price;
    /**
     * 数目
     */
    private int total;
    /**
     * 说明
     */
    private String remake;

    /**
     * 所属厂商
     */
    private TFactory factory;

    public TProduct() {

    }

    public TProduct(Long id, String productName, String core, double price, int total, String remake, TFactory factory) {
        this.id = id;
        this.productName = productName;
        this.core = core;
        this.price = price;
        this.total = total;
        this.remake = remake;
        this.factory = factory;
    }

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

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public TFactory getFactory() {
        return factory;
    }

    public void setFactory(TFactory factory) {
        this.factory = factory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
