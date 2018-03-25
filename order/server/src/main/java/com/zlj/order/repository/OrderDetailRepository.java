package com.zlj.order.repository;

import com.zlj.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 张璐杰
 * 2018/3/16 22:08
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
