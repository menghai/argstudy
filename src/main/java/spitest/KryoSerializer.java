package spitest;

/**
 * @author haicheng.lhc@alibaba-inc.com 2019/03/11
 * @date 2019/03/11
 */

public class KryoSerializer implements  ObjectSerializer{
    @Override
    public String getName() {
        return "KryoSerializer";
    }
}
