package com.purplestudio.designpattern.prototype;

/**
 * General. 2024/10/18 16:26
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class General extends GameUnit {
    private String state = "idle";

    public void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return "General " + state + "@" + getPosition();
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }
    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("General are unique");
    }
}
