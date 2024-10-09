package com.purplestudio.designpattern.builder.example2;

import lombok.Getter;
import lombok.Setter;

/**
 * Address. 2024/10/08 17:07
 * Description: entity class
 * Author: Ricky
 *
 * @version 1.0.0
 */
@Setter
@Getter
public class Address {
    private String houseNumber;
    private String street;
    private String city;
    private String zipcode;
    private String state;
}
