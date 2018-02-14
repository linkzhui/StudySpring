package event;

import org.springframework.context.ApplicationEvent;
public class DemoEvent extends ApplicationEvent{

    //自定义事件
    private String msg;
    private static final long serialVersionUID = 1L;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the component that published the event (never {@code null})
     */
    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }

    public void serMsg(String msg)
    {
        this.msg = msg;
    }
}
