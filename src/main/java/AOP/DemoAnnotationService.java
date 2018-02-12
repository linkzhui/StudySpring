package AOP;

//编写使用注解的被拦截类


import org. springframework. stereotype. Service;

@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){
        System.out.println("this is demo annotation service");
    }
}
