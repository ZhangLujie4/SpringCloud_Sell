package com.zlj.product.common;

import lombok.Data;

/**
 * Created by 张璐杰
 * 2018/3/23 11:23
 */
@Data
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
