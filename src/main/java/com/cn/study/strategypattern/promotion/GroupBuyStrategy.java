package com.cn.study.strategypattern.promotion;

public class GroupBuyStrategy implements PromotionStrategy {

    @Override
    public void dopromotion() {
        System.out.println("拼团，满20人拼团，全团享受团购价。");
    }
}
