package com.cn.study.strategypattern.pay.payport;

/**
 * 微信支付
 */
public class WeChatPay extends Payment {

    public String getName(){
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 256;
    }
}
