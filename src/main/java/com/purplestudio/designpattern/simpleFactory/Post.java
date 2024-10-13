package com.purplestudio.designpattern.simpleFactory;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Post. 2024/10/13 13:55
 * Description: Represents a generic post on a website
 * Author: Ricky
 *
 * @version 1.0.0
 */
@Data
public abstract class Post {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime creationOn;
    private LocalDateTime publishedOn;
}
