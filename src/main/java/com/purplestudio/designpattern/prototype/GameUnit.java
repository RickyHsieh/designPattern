package com.purplestudio.designpattern.prototype;

import javafx.geometry.Point3D;
/**
 * GameUnit. 2024/10/18 16:01
 * Description: this class represents an abstract prototype & defines the clone method
 * Author: Ricky
 *
 * @version 1.0.0
 */
public abstract class GameUnit implements Cloneable {

    private Point3D position;

    GameUnit() {
        position = Point3D.ZERO;
    }

    public GameUnit(float x, float y, float z) {
        position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return position;
    }


    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone(); // shallow copy
        unit.initialize();
        return unit;
    }

    protected void initialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    protected  abstract void reset();
}
