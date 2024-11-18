package com.purplestudio.designpattern.adapter;

/**
 * BusinessCardDesigner. 2024/11/15 15:33
 * Description: Client code which requires Customer interface
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        String card = "";
        card += "\n" + customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }



}

