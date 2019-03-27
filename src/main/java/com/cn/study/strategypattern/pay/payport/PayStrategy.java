package com.cn.study.strategypattern.pay.payport;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
    public static final String ALI_PAY = "aliPay";
    public static final String JD_PAY = "jdPay";
    public static final String WECHAT_PAY = "weChatPay";
    public static final String UNION_PAY = "unionPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String, Payment> payStrategy = new HashMap<String, Payment>();

    static {
        payStrategy.put(ALI_PAY, new AliPay());
        payStrategy.put(JD_PAY, new JDPay());
        payStrategy.put(WECHAT_PAY, new WeChatPay());
        payStrategy.put(UNION_PAY, new UnionPay());
    }

    public static Payment get(String payKey){
        if(payStrategy.containsKey(payKey)){
            return payStrategy.get(payKey);
        }
        return payStrategy.get(DEFAULT_PAY);
    }

}
