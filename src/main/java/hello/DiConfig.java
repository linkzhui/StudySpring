package hello;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//Configuration声明当前类是一个配置类

@ComponentScan("hello")
//ComponentScan自动扫描包名下所有使用import org. springframework. context. annotation. Configuration;

public class DiConfig {

}
