package Enable;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.scheduling.annotation.AsyncConfigurationSelector;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AsyncConfigurationSelector.class)

public @interface EnableAsync {
    Class<? extends Annotation> annotation() default Annotation.class;
    boolean proxyTargetClass() default false;
    AdviceMode mode() default AdviceMode.PROXY;
    int order() default Ordered. LOWEST_PRECEDENCE;

}


//第二类:一句条件选择配置类
//AsyncConfigurationSelector通过条件来选择需要导入的配置类，AsyncConfigurationSelector的根接口为ImportSelector，
//这个接口需重写selectImports方法，在此方法内进行事先条件判断。
//此例中，若adviceMode为PORXY，则返回ProxyAsyncConfiguration这个配置类；
//若activeMode为ASPECTJ,则返回AspectJAsyncConfiguration配置类，
