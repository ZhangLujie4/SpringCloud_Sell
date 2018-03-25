package com.zlj.order.exception;

import com.zlj.order.enums.ResultEnum;

/**
 * Created by 张璐杰
 * 2018/3/17 13:38
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
