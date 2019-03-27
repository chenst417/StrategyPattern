package com.cn.study.strategypattern.promotion;

public class CouponStrategy implements PromotionStrategy {

    @Override
    public void dopromotion() {
        System.out.println("领取优惠券，课程的价格直接减去优惠券面值进行抵扣。");
    }
}
