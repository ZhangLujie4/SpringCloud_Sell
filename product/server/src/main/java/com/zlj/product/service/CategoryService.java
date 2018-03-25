package com.zlj.product.service;

import com.zlj.product.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by 张璐杰
 * 2018/3/16 1:39
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
