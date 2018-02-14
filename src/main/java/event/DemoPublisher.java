package event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;

    public void publish(String msg)
    {
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}


//注入ApplicationContext用来发布事件

//使用ApplicationContext的publishEvent来发布