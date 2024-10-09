package com.purplestudio.designpattern.builder.basic;

import lombok.Setter;

/**
 * Director. 2024/10/08 15:24
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
@Setter
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public void contruct() {
        builder.buildId();
        builder.buildMemo();
        builder.buildName();
    }
}
