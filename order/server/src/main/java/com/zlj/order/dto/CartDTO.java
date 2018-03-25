package com.zlj.order.dto;

import lombok.Data;

/**
 * Created by 张璐杰
 * 2018/3/18 11:18
 */
@Data
public class CartDTO {

    //商品id
    private String productId;

    //商品数量
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
