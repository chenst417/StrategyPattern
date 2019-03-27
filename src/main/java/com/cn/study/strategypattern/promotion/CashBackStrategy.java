package com.cn.study.strategypattern.promotion;

public class CashBackStrategy implements PromotionStrategy {

    @Override
    public void dopromotion() {
        System.out.println("返现促销，返回的金额直接转到支付宝账号。");
    }
}
