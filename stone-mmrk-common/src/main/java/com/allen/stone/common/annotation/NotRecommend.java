package com.allen.stone.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于标识不推荐写法
 * @author Allen
 * @version V1.0.0
 * @date 2018/10/22 15:26
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface NotRecommend {

    String value() default "";

}
