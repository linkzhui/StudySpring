package conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import javax.crypto.Mac;

@Configuration
public class ConditionConifig {
    @Bean
    @Conditional(MacCondition.class)
    public ListService MacListService(){
        System.out.println("return mac list service");
        return new MacListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService LinuxListService(){
        return new LinuxListService();
    }

}


//1. 通过@Conditional注解，符合Linux条件则会实例化LinuxListService
//2. 通过@Conditional注解，符合Mac条件则会实例化MacListService

