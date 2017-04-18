import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sunwei3 on 2017/4/14.
 */
public class TestAOP {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:aopConfig.xml");
        IConnect connect = (IConnect) context.getBean("connectProxy");
        connect.connect("IS");
    }
}
