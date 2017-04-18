import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sunwei3 on 2017/4/14.
 */
public class TestAOP4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:aopConfig4.xml");
        IConnect connect = (IConnect)context.getBean("target") ;
        connect.connect("IS4");
    }
}
