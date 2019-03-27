package com.cn.study.strategypattern.promotion;

import org.apache.commons.lang.StringUtils;

public class PromotionActivityTest {

    /*public static void main(String[] args) {
        PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
        activity618.execute();

        PromotionActivity activity1111 = new PromotionActivity(new CashBackStrategy());
        activity1111.execute();
    }*/


    /*public static void main(String[] args) {
        PromotionActivity activity = null;
        String promotionKey = "COUPON";

        if(StringUtils.equals(promotionKey, "COUPON")){
            activity = new PromotionActivity(new CouponStrategy());
        }else if (StringUtils.equals(promotionKey, "CASHBACK")){
            activity = new PromotionActivity(new CashBackStrategy());
        }
        activity.execute();
    }*/

    public static void main(String[] args) {
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy("CASHBACK");
        PromotionActivity activity = new PromotionActivity(promotionStrategy);

        activity.execute();
    }

}
