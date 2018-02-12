package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype. Service;

@Service
public class UseFunctionService {

    //使用@ Autowired 将 FunctionService 的 实体 Bean 注入 到 UseFunctionService 中， 让 UseFunctionService 具备 FunctionService 的 功能，

    @Autowired
    FunctionService functionService;

    @Autowired
    FunctionService_1 functionService_1;

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }

    public String SayHello_1(String word)
    {
        return functionService_1.sayHello(word);
    }
}
