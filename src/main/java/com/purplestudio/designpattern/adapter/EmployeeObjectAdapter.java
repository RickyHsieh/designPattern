package com.purplestudio.designpattern.adapter;

/**
 * EmployeeObjectAdapter. 2024/11/15 17:10
 * Description: An Object adapter. Using composition to translate interface
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class EmployeeObjectAdapter implements Customer{

    private Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getName() {
        return adaptee.getFullName();
    }

    @Override
    public String getDesignation() {
        return adaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return adaptee.getOfficeLocation();
    }
}
