package com.zlj.product.enums;

import lombok.Getter;

/**
 * Created by 张璐杰
 * 2018/3/15 23:18
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "上架"),

    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
