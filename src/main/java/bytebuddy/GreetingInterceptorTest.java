package bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;

import java.util.function.Function;

/**
 * @author haicheng.lhc@alibaba-inc.com 2018/12/29
 * @date 2018/12/29
 */

public class GreetingInterceptorTest {

    public  Class<? extends Function> getBuuddy(){ Class<? extends Function> dynamicType = new ByteBuddy()
            .subclass(Function.class)
            .method(ElementMatchers.named("apply"))
            .intercept(MethodDelegation.to(new GreetingInterceptor()))
            .make()
            .load(getClass().getClassLoader())
            .getLoaded();

        return dynamicType;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        GreetingInterceptorTest greetingInterceptorTest = new GreetingInterceptorTest();
        System.out.println(greetingInterceptorTest.getBuuddy().newInstance().apply("Byte Buddy"));
    }
}
