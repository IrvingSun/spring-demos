import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sunwei3 on 2017/4/14.
 */
public class TestAOP2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:aopConfig2.xml");
        IConnect connect = (IConnect)context.getBean("target") ;
        connect.connect("IS2");
    }
}
