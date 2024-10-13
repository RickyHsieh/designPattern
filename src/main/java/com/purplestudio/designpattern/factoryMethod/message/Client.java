package com.purplestudio.designpattern.factoryMethod.message;

/**
 * Client. 2024/10/13 15:42
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg);
    }
}
