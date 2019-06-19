package fastsqltest;

import java.lang.reflect.Field;

/**
 * @author haicheng.lhc@alibaba-inc.com 2018/12/24
 * @date 2018/12/24
 */

public class Treflect {

    public TSubclass gettSubclass() {
        return tSubclass;
    }

    private TSubclass tSubclass;


    public Treflect(){
        tSubclass = new TSubclass("88888");
    }
    public void reflect(){
        Class targetClass = tSubclass.getClass();

        Field field;
        try {
            field = targetClass.getSuperclass().getDeclaredField("aa");
            field.setAccessible(true);
            System.out.println(field);
            field.set(tSubclass,"00000000");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Treflect treflect = new Treflect();
        treflect.reflect();
        treflect.gettSubclass().printAa();

    }
}
