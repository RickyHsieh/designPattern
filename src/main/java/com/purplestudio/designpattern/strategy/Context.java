package com.purplestudio.designpattern.strategy;

/**
 * Context. 2024/04/14 23:37
 * Description: 維護一個上下文對Strategy物件的引用
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //上下文介面
    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
