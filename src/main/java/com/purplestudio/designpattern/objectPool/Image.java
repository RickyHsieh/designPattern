package com.purplestudio.designpattern.objectPool;

import javafx.geometry.Point2D;
import org.apache.tomcat.jni.Pool;

/**
 * Bitmap. 2024/11/05 15:42
 * Description: concrete reusable
 * Author: Ricky
 *
 * @version 1.0.0
 */
public interface Image extends Poolable {
    void draw();
    Point2D getLocation();
    void setLocation(Point2D location);
}
