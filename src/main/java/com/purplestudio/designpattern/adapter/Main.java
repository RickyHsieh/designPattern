package com.purplestudio.designpattern.adapter;

/**
 * Main. 2024/11/15 16:55
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        // using class two-way adapter
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);
        System.out.println("==========================================================");
        // object adapter
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        card  = designer.designCard(objectAdapter);
        System.out.println(card);

    }
    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elon");
        employee.setJobTitle("Maanager");
        employee.setOfficeLocation("Cyber City");
    }

}
