package com.purplestudio.designpattern.builder.basic;

import lombok.Setter;

/**
 * Product. 2024/10/08 15:14
 * Description: 商品
 * Author: Ricky
 *
 * @version 1.0.0
 */
@Setter
public class Product {
    private long id;
    private String name;
    private String memo;
    @Override
    public String toString() {
        return "product == id: " + id + "name: " + name + " memo: " + memo;
    }
}
