package com.purplestudio.designpattern.builder.basic;

/**
 * main. 2024/10/08 15:26
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
class BuilderDemo {
    public static void main(String[] args) {

        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.contruct();
        System.out.println(builder.getResult());

    }
}
