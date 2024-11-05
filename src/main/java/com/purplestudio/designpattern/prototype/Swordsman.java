package com.purplestudio.designpattern.prototype;

/**
 * Swordsman. 2024/10/18 16:09
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class Swordsman extends GameUnit {
    private String state = "idle";
    public void attack() {
        this.state = "attacking";
    }
    @Override
    public String toString() {
        return "Swordsman" + state + "@" + getPosition();
    }

    @Override
    protected void reset() {
        state = "idle";
    }
}
