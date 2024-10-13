package com.purplestudio.designpattern.simpleFactory;

import lombok.Data;

/**
 * BlogPost. 2024/10/13 13:59
 * Description:
 * Author: Ricky
 *
 * @version 1.0.0
 */
@Data
public class BlogPost extends Post {
    private String author;
    private String[] tags;
}
