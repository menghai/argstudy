package bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

/**
 * @author haicheng.lhc@alibaba-inc.com 2018/12/29
 * @date 2018/12/29
 */

public class HelloWord {

    public Class<?> getdynamicType(){
        Class<?> dynamicType = new ByteBuddy()
            .subclass(Object.class)
            .method(ElementMatchers.named("toString"))
            .intercept(FixedValue.value("Hello World!"))
            .make()
            .load(getClass().getClassLoader())
            .getLoaded();
        return dynamicType;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        HelloWord helloWord = new HelloWord();
        System.out.println(helloWord.getdynamicType().newInstance().toString());

    }
}
