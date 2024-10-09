package com.purplestudio.designpattern.builder.example2;


import java.time.LocalDate;

/**
 * Client. 2024/10/09 14:44
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDTO dto = directBuild(UserDTO.getBuilder(), user);
        System.out.println(dto);
    }

    private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
       return builder.withAddress(user.getAddress())
               .withLastName(user.getLastName())
               .withFirstName(user.getFirstName())
               .withBirthday(user.getBirthday()).build();
    }


    /**
     * Return Sample user
     * @return
     */
    public static User createUser() {
        User user = new User();
        user.setBirthday(LocalDate.of(1996,3,2));
        user.setFirstName("Hsieh");
        user.setLastName("Ricky");
        Address address = new Address();
        address.setCity("Taipei");
        address.setState("ZhongShan");
        address.setZipcode("00878");
        address.setStreet("zhongShan");
        user.setAddress(address);
        return user;
    }
}
