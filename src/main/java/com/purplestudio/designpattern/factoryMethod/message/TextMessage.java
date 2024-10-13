package com.purplestudio.designpattern.factoryMethod.message;

/**
 * TextMessage. 2024/10/13 15:33
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class TextMessage extends Message {

    @Override
    public String getContent() {
        return "Text";
    }
}
