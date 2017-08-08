package com.springinaction.pizza.service;

import com.springinaction.pizza.PaymentException;

/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/8/7
 */
public class PaymentProcessor {

    public PaymentProcessor() {
    }

    public void approveCreditCard(String creditCardNumber,String expMonth,
                                  String expYear,float amount) throws PaymentException {
        if(amount > 20.00 ){
            throw new PaymentException();
        }

    }
}
