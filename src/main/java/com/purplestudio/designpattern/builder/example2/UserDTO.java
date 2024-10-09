package com.purplestudio.designpattern.builder.example2;

import lombok.Data;
import java.time.LocalDate;
import java.time.Period;
/**
 * UserDTO. 2024/10/08 17:09
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class UserDTO {
    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }

    // inner ststic class
    public static class UserDTOBuilder {
        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String fname) {
            this.firstName = fname;
            return this;
        }

        public UserDTOBuilder withLastName(String lname) {
            this.lastName = lname;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date) {
            Period ageInYears = Period.between(date, LocalDate.now());
            this.age = Integer.toString(ageInYears.getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getCity() + ", " + address.getStreet() + ", " + address.getState();
            return this;
        }

        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setAge(age);
            userDTO.setName(firstName + " 555," + lastName);
            userDTO.setAddress(address);
            return this.userDTO;
        }

        public UserDTO getUserDTO() {
            return this.userDTO;
        }
    }

}
