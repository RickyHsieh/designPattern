package com.purplestudio.designpattern.factoryMethod.message;

/**
 * JSONMessage. 2024/10/13 15:30
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class JSONMessage extends Message {
    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }
}
