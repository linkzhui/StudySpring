package hello;

import org.springframework.stereotype.Service;

@Service //1
public class FunctionService {
    public String sayHello(String word)
    {
        return "Hello" + word + " !";
    }
}

//这里采用@Service注明这是一个Bean