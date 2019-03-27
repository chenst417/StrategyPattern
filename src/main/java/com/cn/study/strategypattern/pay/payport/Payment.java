package com.cn.study.strategypattern.pay.payport;

import com.cn.study.strategypattern.pay.MsgResult;

public abstract class Payment {
    //获取支付名称
    public abstract String getName();
    //查询余额
    protected abstract double queryBalance(String uid);
    // 返回结果
    public MsgResult pay(String uid, double amount){
        if(queryBalance(uid) <amount){
            return new MsgResult(500,"支付失败。","余额不足。");
        }
        return new MsgResult(200,"支付成功。","支付金额：" + amount);
    }

}
