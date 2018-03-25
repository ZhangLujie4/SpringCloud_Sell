package com.zlj.product.VO;

import lombok.Data;

/**
 * http返回的最外层对象
 * Created by 张璐杰
 * 2018/3/16 1:48
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
