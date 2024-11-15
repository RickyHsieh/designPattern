package com.purplestudio.designpattern.objectPool;

import javafx.geometry.Point2D;

/**
 * Client. 2024/11/05 16:39
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class Client {
    private final static ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Logo.bmp") ,5);

    public static void main(String[] args) {
        Bitmap b1 = bitmapPool.get();
        b1.setLocation(new Point2D(10, 10));
        Bitmap b2 = bitmapPool.get();
        b2.setLocation(new Point2D(20, 10));

        b1.draw();
        b2.draw();

        bitmapPool.release(b1);
        bitmapPool.release(b2);
    }

}
