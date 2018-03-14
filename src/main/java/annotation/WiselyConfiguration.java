package annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration  //1
@ComponentScan("annotation")  //2
public @interface WiselyConfiguration {
    String[] value() default{}; //3
}


//1. 组合@Configuration元注解
//2. 组合@ComponentScan元注解
//3. 覆盖value参数

