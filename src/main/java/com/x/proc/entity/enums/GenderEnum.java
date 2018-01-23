package com.x.proc.entity.enums;

import com.baomidou.mybatisplus.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 19/01/2018
 * Time: 5:59 PM
 * ReMake: 性别枚举
 */
public enum GenderEnum implements IEnum {
    ZERO(0, "男"),
    ONE(1, "女");

    private int value;
    private String desc;

    GenderEnum(final int value, final String desc) {
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
