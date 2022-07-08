package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Orders;

/**
 * @author COMMON-PC-1
 */
public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     *
     * @param orders
     */
    public void submit(Orders orders);
}
