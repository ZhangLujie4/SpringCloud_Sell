package com.zlj.order.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by 张璐杰
 * 2018/3/17 13:30
 */
@Data
public class OrderForm {

    @NotEmpty(message = "姓名必填")
    private String name;

    @NotEmpty(message = "电话必填")
    private String phone;

    @NotEmpty(message = "地址必填")
    private String address;

    @NotEmpty(message = "openid必填")
    private String openid;

    @NotEmpty(message = "items")
    private String items;

}
