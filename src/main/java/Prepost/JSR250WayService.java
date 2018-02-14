package Prepost;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
    @PostConstruct //1

    //在构造函数执行之后执行
    public void init() {
        System.out.println("jsr250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    //在bean销毁之前执行
    @PreDestroy //2
    public void destroy() {
        System.out.println("jsr250-destory-method");
    }

}
