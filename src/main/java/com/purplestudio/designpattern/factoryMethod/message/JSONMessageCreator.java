package com.purplestudio.designpattern.factoryMethod.message;

/**
 * JSONMessageCreator. 2024/10/13 15:39
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class JSONMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
