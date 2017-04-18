import com.sun.jmx.remote.internal.IIOPProxy;
import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.core.InfrastructureProxy;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Proxy;

/**
 * Created by sunwei3 on 2017/4/14.
 */
public class BeforeConnectTest {
    public static void main(String[] args) {
        IConnect target = new ConnectImpl();
        BeforeConnect advice = new BeforeConnect();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(target);
        proxyFactory.addAdvice(advice);

        IConnect iConnectProxy = (IConnect) proxyFactory.getProxy();

        iConnectProxy.connect("Irving");
    }
}

