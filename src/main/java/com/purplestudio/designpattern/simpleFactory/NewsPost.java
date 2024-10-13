package com.purplestudio.designpattern.simpleFactory;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * NewsPost. 2024/10/13 13:57
 * Description: Represents a new post
 * Author: Ricky
 *
 * @version 1.0.0
 */
@Data
public class NewsPost extends Post{
    private String headline;
    private LocalDateTime newsTime;
}
