package com.cn.study.strategypattern.pay.payport;

import com.cn.study.strategypattern.pay.MsgResult;
import com.cn.study.strategypattern.pay.Order;

public class PayStrategyTest {

    public static void main(String[] args) {
        Order order = new Order("1","2019032700001",324.45);

        MsgResult msgResult = order.pay(PayStrategy.UNION_PAY);

        System.out.println(msgResult);

    }

}
