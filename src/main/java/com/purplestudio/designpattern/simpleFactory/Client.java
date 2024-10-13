package com.purplestudio.designpattern.simpleFactory;

/**
 * Client. 2024/10/13 14:03
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Post post = PostFactory.createPost("blog");
        System.out.println(post);
    }
}
