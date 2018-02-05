package com.x.proc.entity.enums;

import com.baomidou.mybatisplus.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 05/02/2018
 * Time: 8:44 PM
 */
public enum UserStateEnum implements IEnum {
    ONE(1, "启用"),
    TWO(2, "禁用");

    private int value;
    private String desc;

    UserStateEnum(final int value, final String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Serializable getValue() {
        return this.value;
    }

    @JsonValue
    public String getDesc() {
        return this.desc;
    }
}
