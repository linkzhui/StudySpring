import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Documented
@Configuration  //1
@ComponentScan  //2
public @interface WiselyConfiguration {
    String[] value() default{}; //3
}


//1. 组合@Configuration元注解
//2. 组合@ComponentScan元注解
//3. 覆盖value参数

