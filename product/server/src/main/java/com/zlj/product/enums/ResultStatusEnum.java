package com.zlj.product.enums;

import lombok.Getter;

/**
 * Created by 张璐杰
 * 2018/3/16 18:58
 */
@Getter
public enum ResultStatusEnum {
    SUCCESS(0, "成功"),

    PRODUCT_NOT_EXIST(1, "商品不存在"),

    PRODUCT_STOCK_ERROR(2, "库存异常"),
    ;

    private Integer code;

    private String msg;

    ResultStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
