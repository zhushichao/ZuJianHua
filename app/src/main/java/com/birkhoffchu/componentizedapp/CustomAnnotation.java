package com.birkhoffchu.componentizedapp;

/**
 * Created by jerry on 2018/4/13.
 */

public @interface CustomAnnotation {

    boolean isNull() default false;

    int maxLength() default 8;

    String description() default "";
}
