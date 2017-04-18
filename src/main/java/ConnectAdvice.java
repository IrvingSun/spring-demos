import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by sunwei3 on 2017/4/17.
 */
public class ConnectAdvice implements MethodInterceptor{
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("ConnectAdvice----before");
        Object obj = invocation.proceed();
        System.out.println("ConnectAdvice----after");
        return obj;
    }
}
