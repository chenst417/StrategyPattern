package com.cn.study.strategypattern.pay.payport;

/**
 * 京东支付
 */
public class JDPay extends Payment {

    public String getName(){
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
