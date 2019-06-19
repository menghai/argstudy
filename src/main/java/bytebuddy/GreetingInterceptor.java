package bytebuddy;

/**
 * @author haicheng.lhc@alibaba-inc.com 2018/12/29
 * @date 2018/12/29
 */

public class GreetingInterceptor {

    public Object greet(Object argument) {
        return "Hello from " + argument;
    }

    public Object greet3(Object argument) {
        return "Hello from999 " + argument;
    }
}
