package com.cn.study.strategypattern.promotion;

public class EmptyStrategy implements PromotionStrategy {

    @Override
    public void dopromotion() {
        System.out.println("无促销活动。");
    }
}
