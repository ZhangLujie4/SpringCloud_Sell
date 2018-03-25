package com.zlj.product.exception;

import com.zlj.product.enums.ResultStatusEnum;

/**
 * Created by 张璐杰
 * 2018/3/18 11:27
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultStatusEnum resultStatusEnum) {
        super(resultStatusEnum.getMsg());
        this.code = resultStatusEnum.getCode();
    }
}
