package com.purplestudio.designpattern.builder.example;

import lombok.Data;

/**
 * UserWebDTO. 2024/10/08 17:08
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
@Data
public class UserWebDTO extends UserDTO{
    private String name;
    private String address;
    private String age;

    public UserWebDTO(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}
