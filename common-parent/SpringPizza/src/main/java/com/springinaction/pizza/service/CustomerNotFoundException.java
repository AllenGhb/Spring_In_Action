package com.springinaction.pizza.service;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/8/7
 */
@SuppressWarnings("serial")
public class CustomerNotFoundException extends Exception {

    public CustomerNotFoundException(){}

    public CustomerNotFoundException(String message){
        super(message);
    }

}
