package com.cn.study.strategypattern.promotion;

import java.util.Map;
import java.util.HashMap;

public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY =
            new HashMap<String, PromotionStrategy>();

    static {
        PROMOTION_STRATEGY.put(PromotionKey.coupon, new CouponStrategy()) ;
        PROMOTION_STRATEGY.put(PromotionKey.cashback, new CashBackStrategy()) ;
        PROMOTION_STRATEGY.put(PromotionKey.groupbuy, new GroupBuyStrategy()) ;
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();

    private PromotionStrategyFactory () { }

    public static PromotionStrategy getPromotionStrategy(String pomotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY.get(pomotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    interface PromotionKey{
        public String coupon = "COUPON";
        public String cashback = "CASHBACK";
        public String groupbuy = "GROUPBUY";
    }
}
