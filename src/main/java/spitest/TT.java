package spitest;

/**
 * @author haicheng.lhc@alibaba-inc.com 2019/03/11
 * @date 2019/03/11
 */

public class TT {
    public static void main(String[] args) {
        SerializerService serializerService = new SerializerService();
        ObjectSerializer objectSerializer = serializerService.getSerializerService();
        System.out.println(objectSerializer.getName());
    }
}
