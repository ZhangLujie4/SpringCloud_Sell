package com.zlj.order.enums;

import lombok.Getter;

/**
 * Created by 张璐杰
 * 2018/3/16 22:27
 */

@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功")
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
