package com.purplestudio.designpattern.builder.basic;

/**
 * Builder. 2024/10/08 15:20
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
interface Builder {
    void buildId();
    void buildName();
    void buildMemo();
    Product getResult();
}
