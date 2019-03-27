package com.cn.study.strategypattern.pay.payport;

/**
 * 支付宝支付
 */
public class AliPay extends Payment {

    public String getName(){
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
