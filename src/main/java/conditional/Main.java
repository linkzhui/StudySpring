package conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Condition;

public class Main {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConifig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(listService.showListCmd());
    }
}
