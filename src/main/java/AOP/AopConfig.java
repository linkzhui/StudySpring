package AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("AOP")
@EnableAspectJAutoProxy
public class AopConfig {

}

//使用@EnableAspectJAutoProxy注解开启Spring对AscpectJ代理的支持