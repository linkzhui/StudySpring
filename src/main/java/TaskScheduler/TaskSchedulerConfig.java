package TaskScheduler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ComponentScan("TaskScheduler")
public class TaskSchedulerConfig {

}

//通过@EnableScheduling注解来开启对于任务计划的支持