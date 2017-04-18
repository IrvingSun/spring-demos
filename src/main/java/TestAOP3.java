import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sunwei3 on 2017/4/14.
 */
public class TestAOP3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:aopConfig3.xml");
        IConnect connect = (IConnect)context.getBean("target") ;
        connect.connect("IS3");
    }
}
