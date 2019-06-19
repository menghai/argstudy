package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author haicheng.lhc@alibaba-inc.com 2019/03/07
 * @date 2019/03/07
 */

public class ProxyFactory {

    private  Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public class CInvocationHandler implements InvocationHandler{
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("开始事务2");
            //执行目标对象方法
            Object returnValue = method.invoke(target, args);
            System.out.println("提交事务2");
            return returnValue;
        }
    }

    public Object getProxyInstance() {
        CInvocationHandler cInvocationHandler = new CInvocationHandler();
        return Proxy.newProxyInstance(
            target.getClass().getClassLoader(),
            target.getClass().getInterfaces(),
            cInvocationHandler
        );
    }
}
