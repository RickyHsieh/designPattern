package com.purplestudio.designpattern.adapter;

/**
 * EmployeeObjectAdapter. 2024/11/15 15:18
 * Description: An object adapter. Using competition to translate interface
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class EmployeeClassAdapter extends Employee implements Customer{

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
