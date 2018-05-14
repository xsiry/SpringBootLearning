package com.x.proc.entity.t;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 07/02/2018
 * Time: 5:32 PM
 */
public class TProduct extends Model<TFactory> {

    private static final long serialVersionUID = -5332553974926111150L;

    @TableId
    private String guid;

    /**
     * 名称
     */
    @TableField("product_name")
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
     * 所属厂商id
     */
    @TableField("factory_guid")
    private String factoryGuid;

    /**
     * 所属厂商
     */
    @TableField(exist = false)
    private TFactory factory;

    public TProduct() {

    }

    public TProduct(String guid, String productName, String core, double price, int total, String remake, String factoryGuid, TFactory factory) {
        this.guid = guid;
        this.productName = productName;
        this.core = core;
        this.price = price;
        this.total = total;
        this.remake = remake;
        this.factory = factory;
        this.factoryGuid = factoryGuid;
    }

    @Override
    protected Serializable pkVal() {
        return this.guid;
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

    public String getFactoryGuid() {
        return factoryGuid;
    }

    public void setFactoryGuid(String factoryGuid) {
        this.factoryGuid = factoryGuid;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
}
