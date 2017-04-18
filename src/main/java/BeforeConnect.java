import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by sunwei3 on 2017/4/14.
 */
public class BeforeConnect implements MethodBeforeAdvice{
    public void before(Method method, Object[] args, Object target) throws Throwable {
        String name = (String)args[0];
        System.out.println("连接前处理...");
    }
}
