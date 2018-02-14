package Scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ScopeConfig.class");
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
        DemoSingleService s1 = context.getBean(DemoSingleService.class);
        DemoSingleService s2 = context.getBean(DemoSingleService.class);
        System.out.println(p1==p2);
        System.out.println(s1==s2);
        context.close();
    }
}
