package com.purplestudio.designpattern.builder.example;

import java.time.LocalDate;

/**
 * UserDTOBuilder. 2024/10/08 17:09
 * Description: Abstract builder
 * Author: Ricky
 *
 * @version 1.0.0
 */
public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String fname);
    UserDTOBuilder withLastName(String lname);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);
    UserDTO build();
    UserDTO getUserDTO();
}
