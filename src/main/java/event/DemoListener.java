package event;

import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationListener;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> //1

{


    @Override
    public void onApplicationEvent(DemoEvent event) {

        //2

        String msg = event.getMsg();
        System.out.println(" 我(bean-demoListener)接收到了bean-demoPublisher发布的消息:" + msg);

    }
}


//① 实现ApplicationListener接口，并指定监听的事件类型。
//② 使用onApplicationEvent方法对消息进行接受处理。