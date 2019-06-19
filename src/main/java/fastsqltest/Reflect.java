package fastsqltest;

import java.lang.reflect.Field;

/**
 * @author haicheng.lhc@alibaba-inc.com 2018/12/24
 * @date 2018/12/24
 */

public class Reflect extends TSuper{
    public Reflect(String aa) {
        super(aa);
    }

    public void reflect(){
        Class targetClass = super.getClass();

        Field[] f = targetClass.getDeclaredFields();

                for(Field a : f){
                    a.setAccessible(true);
                    System.out.println(a.getName());

                }

        Field field;
        try {
            field = targetClass.getDeclaredField("aa");
            field.setAccessible(true);
            System.out.println(field);
//            field.set(super."00000000");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        Reflect reflect = new Reflect("mmmmmm000");
        reflect.reflect();
        reflect.printAa();

    }
}
