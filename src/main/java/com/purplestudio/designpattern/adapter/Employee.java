package com.purplestudio.designpattern.adapter;

/**
 * Employee. 2024/11/15 15:21
 * Description: An existing class used in our system
 * Adaptee
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class Employee {

    private String fullName;

    private String jobTitle;

    private String officeLocation;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
}
