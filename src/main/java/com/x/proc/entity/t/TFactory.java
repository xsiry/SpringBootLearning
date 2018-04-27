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

    private Long id;
    /**
     * 厂商名称
     */
    @TableField("factory_name")
    private String factoryName;
    /**
     * 厂商地址
     */
    private String factoryAdd;
    /**
     * 厂商电话
     */
    private String contno;
    /**
     * 厂商备注
     */
    private String remake;

    @TableField(exist = false)
    private List<TProduct> products; // 拥有产品

    public TFactory() {

    }

    public TFactory(Long id, String factoryName, String factoryAdd, String contno, String remake, List<TProduct> products) {
        this.id = id;
        this.factoryName = factoryName;
        this.factoryAdd = factoryAdd;
        this.contno = contno;
        this.remake = remake;
        this.products = products;
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

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryAdd() {
        return factoryAdd;
    }

    public void setFactoryAdd(String factoryAdd) {
        this.factoryAdd = factoryAdd;
    }

    public String getContno() {
        return contno;
    }

    public void setContno(String contno) {
        this.contno = contno;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public List<TProduct> getProducts() {
        return products;
    }

    public void setProducts(List<TProduct> products) {
        this.products = products;
    }
}
