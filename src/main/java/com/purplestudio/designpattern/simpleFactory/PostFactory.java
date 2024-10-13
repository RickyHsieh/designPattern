package com.purplestudio.designpattern.simpleFactory;

/**
 * PostFactory. 2024/10/13 14:01
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
public class PostFactory {
    /**
     * 使用一個靜態方法
     * @param type
     * @return
     */
    public static Post createPost(String type) {
        switch (type) {
            case "blog" :
                return new BlogPost();
            case "news" :
                return new NewsPost();
            case "product" :
                return new ProductPost();
            default :
                throw new IllegalArgumentException("Post type is unknown");
        }
    }
}
