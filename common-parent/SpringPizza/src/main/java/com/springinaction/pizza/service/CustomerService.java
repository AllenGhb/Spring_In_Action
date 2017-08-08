package com.springinaction.pizza.service;

import com.springinaction.pizza.domain.Customer;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/8/7
 */
public interface CustomerService {

    Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;

}
