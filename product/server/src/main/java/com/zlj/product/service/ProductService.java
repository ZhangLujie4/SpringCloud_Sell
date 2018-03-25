package com.zlj.product.service;

import com.zlj.product.common.DecreaseStockInput;
import com.zlj.product.common.ProductInfoOutput;
import com.zlj.product.dataobject.ProductInfo;

import java.util.List;

/**
 * Created by 张璐杰
 * 2018/3/16 0:39
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 商品列表查询
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
