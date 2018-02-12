package AOP;

//编写使用方法规则被拦截类

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
    public void add(){
        System.out.println("this is demo method");
    }
}
