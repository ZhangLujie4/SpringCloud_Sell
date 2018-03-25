package com.zlj.order.VO;

import lombok.Data;

/**
 * Created by 张璐杰
 * 2018/3/17 14:08
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
