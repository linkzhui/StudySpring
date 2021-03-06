package AOP;

//编写拦截规则的注解

import java. lang. annotation. Documented;
import java. lang. annotation. ElementType;
import java. lang. annotation. Retention;
import java. lang. annotation. RetentionPolicy;
import java. lang. annotation. Target;

@Target( ElementType.METHOD)
@Retention( RetentionPolicy.RUNTIME)
@Documented

public @interface Action {
    String name();
}

//这里定义了 Action是一个注解
