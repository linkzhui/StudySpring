package Java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        //使用AnnotationConfigApplicationContext作为spring的容器，接受输入一个配置类作为参数
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("World"));
        context.close();
    }
}
