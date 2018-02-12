package hello;

import org.springframework.stereotype.Service;

@Service //1
public class FunctionService_1 {
    public String sayHello(String word)
    {
        return "Hello" + word + " !";
    }
}
