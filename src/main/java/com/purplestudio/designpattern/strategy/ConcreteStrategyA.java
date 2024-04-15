package com.purplestudio.designpattern.strategy;

import java.sql.SQLOutput;

/**
 * ConcreteStrategyA. 2024/04/14 23:34
 * Description: 封裝了具體的演算法行為
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class ConcreteStrategyA extends Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("演算法A實現。");
    }
}
