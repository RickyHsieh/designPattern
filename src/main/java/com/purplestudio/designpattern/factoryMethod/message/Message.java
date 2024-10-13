package com.purplestudio.designpattern.factoryMethod.message;

/**
 * Massage. 2024/10/13 15:27
 * Description: This class represents interface for our "product" which is a message
 * Implement wille be specific to content type
 * Author: Ricky
 *
 * @version 1.0.0
 */
public abstract class Message {

    public abstract String getContent();

    public void addDefaultHeaders() {
        // Add some default header
    }

    public void encrypt() {
        //# Has some code to encrypt the content
    }

}
