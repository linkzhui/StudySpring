package SpringAware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware{
    private String beanName;
    private ResourceLoader loader;



    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }


    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean的名称为:"+beanName);
        Resource resource = loader.getResource("classpath:test.txt");
        try {
            System.out.println("ResourceLoader加载的文件内容为:" + IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}


//① 实现 BeanNameAware、 ResourceLoaderAware 接口， 获得 Bean 名称 和 资源 加载 的 服务。
//② 实现 ResourceLoaderAware 需 重写 setResourceLoader。
//③ 实现 BeanNameAware 需 重写 setBeanName 方法。
