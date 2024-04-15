package com.purplestudio.designpattern.strategy;

/**
 * main. 2024/04/14 23:40
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class StrategyMain {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.contextInterface();
//        Context context = new Context(new ConcreteStrategyA());
//        context.contextInterface();
//        Context context = new Context(new ConcreteStrategyA());
//        context.contextInterface();
    }
}
