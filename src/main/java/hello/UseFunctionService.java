package hello;

import org. springframework. beans. factory. annotation. Autowired;
import org. springframework. stereotype. Service;

@Service
public class UseFunctionService {
    @Autowired
    //使用@ Autowired 将 FunctionService 的 实体 Bean 注入 到 UseFunctionService 中， 让 UseFunctionService 具备 FunctionService 的 功能，
    FunctionService functionService;

    public String SayHello(String word)
    {
        return functionService.sayHello(word);
    }
}
