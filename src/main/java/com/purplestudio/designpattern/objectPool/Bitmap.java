package com.purplestudio.designpattern.objectPool;

import javafx.geometry.Point2D;

import java.sql.SQLOutput;

/**
 * Bitmap. 2024/11/05 15:42
 * Description: concrete reusable
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class Bitmap implements Image{

    private Point2D location;
    private String name;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + name + "@" + location);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Bitmap is reset.");
    }
}
