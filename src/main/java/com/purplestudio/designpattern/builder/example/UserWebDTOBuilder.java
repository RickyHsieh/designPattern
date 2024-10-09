package com.purplestudio.designpattern.builder.example;

import java.time.LocalDate;
import java.time.Period;

/**
 * UserWebDTOBuilder. 2024/10/08 17:25
 * Description: the concrete buildere for UserWebDTO
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class UserWebDTOBuilder implements UserDTOBuilder{
    private String fname;
    private String lname;
    private LocalDate date;
    private String address;
    private String age;
    private UserDTO dto;
    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.fname = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lname = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getCity() + ", " + address.getStreet() + ", " + address.getState();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(fname + " " + lname, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
