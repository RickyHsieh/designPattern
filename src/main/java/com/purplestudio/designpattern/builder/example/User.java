package com.purplestudio.designpattern.builder.example;

import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;

/**
 * User. 2024/10/08 17:05
 * Description: entity class
 * Author: Ricky
 *
 * @version 1.0.0
 */
@Data
public class User {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;
}
