package SpringAware;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService AwareService = context.getBean(SpringAware.AwareService.class);
        AwareService.outputResult();
        context.close();
    }
}
