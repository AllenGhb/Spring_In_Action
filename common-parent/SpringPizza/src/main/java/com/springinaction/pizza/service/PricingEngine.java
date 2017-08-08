package com.springinaction.pizza.service;

import com.springinaction.pizza.domain.Order;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/8/7
 */
public interface PricingEngine {

    float calculateOrderTotal(Order order);

}
