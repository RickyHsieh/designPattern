package com.purplestudio.designpattern.factoryMethod.message;

/**
 * MessageCreator. 2024/10/13 15:35
 * Description: this is our abstract "creator"
 * the abstract method createMessage() has to be implemented by its subclass.
 * Author: Ricky
 *
 * @version 1.0.0
 */
public abstract class MessageCreator {
    public Message getMessage() {
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    // factory method
    protected abstract Message createMessage();
}
