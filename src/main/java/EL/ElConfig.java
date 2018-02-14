package EL;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("EL")
@PropertySource("classpath:test.properties")
public class ElConfig {
    @Value("I Love You")
    private String normal; //1

    @Value("#{systemProperties['os.name']}") //2
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}") //3
    private double randomNumber;

    @Value("#{demoService.another}") //4
    private String fromAnother;

    @Value("classpath:test.txt") //5
    private Resource testFile;

    @Value("http://www.baidu.com") //6
    private Resource testUrl;

    @Value("${book.name}") //7
    private String bookName;

    @Autowired
    private Environment environment; //7

    @Bean //7
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
//            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
//            System.out.println(bookName);
            System.out.println(
                    environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//① 注入普通字符串。
//② 注入操作系统属性。
//③ 注入表达式结果。
//④ 注入其他Bean属性。
//⑤ 注入文件资源。
//⑥ 注入网址资源。
//⑦ 注入配置文件。

//注入配置配件需使用@PropertySource指定文件地址,若使用@Value注入，
//则要配置一个PropertySourcesPlaceholderConfigurer的Bean。
//注意，@Value（"${ book.name}"） 使用的是“$”，而不是“#”。注入Properties还可从Environment中获得。
