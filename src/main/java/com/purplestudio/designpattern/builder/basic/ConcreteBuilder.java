package com.purplestudio.designpattern.builder.basic;

/**
 * ConcreteBuilder. 2024/10/08 15:21
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class ConcreteBuilder implements Builder{
    private Product product = new Product();
    @Override
    public void buildId() {
        product.setId(1);
    }

    @Override
    public void buildName() {
        product.setName("Product 1");
    }

    @Override
    public void buildMemo() {
        product.setMemo("This is product 1");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
