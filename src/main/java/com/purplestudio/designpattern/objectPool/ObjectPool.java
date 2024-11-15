package com.purplestudio.designpattern.objectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

/**
 * ObjectPool. 2024/11/05 15:59
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class ObjectPool<T extends Poolable>{
    private BlockingQueue<T> avaliablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        avaliablePool = new LinkedBlockingQueue<>();
        for(int i = 0; i < count; i++) {
            avaliablePool.offer(creator.get());
        }
    }

    public T get() {
        try {
            return avaliablePool.take();
        } catch (InterruptedException ex) {
            System.out.println("take() was interrupted.");
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            avaliablePool.put(obj);
        } catch (InterruptedException e) {
            System.out.println("put() was interrupted.");
        }
    }
}
