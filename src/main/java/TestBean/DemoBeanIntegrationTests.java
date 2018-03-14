package TestBean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //1
@ContextConfiguration(classes = {TestConfig.class})  //2
@ActiveProfiles("prod")  //3
public class DemoBeanIntegrationTests {
    @Autowired   //4
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject(){
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected,actual);
    }
}


//1. SpringJUnit4ClassRunner在JUnit环境下提供Spring TestContext Framework的功能
//2. @ContextConfiguration用来加载配置ApplicationContext，其中class属性用来加载配置类
//③ @ActiveProfiles 用来 声明 活动 的 profile。
//④ 可使用普通的@Autowired注入Bean。
//⑤ 测试代码，通过JUnit的Assert来校验结果是否和预期一致。
