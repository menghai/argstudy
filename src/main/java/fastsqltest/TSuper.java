package fastsqltest;

/**
 * @author haicheng.lhc@alibaba-inc.com 2018/12/24
 * @date 2018/12/24
 */

public class TSuper {

    private String aa;

    public void settAa(String aa){
        this.aa = aa;
    }

    public TSuper(String aa){
        this.aa = aa;
    }
    public void printAa(){
        System.out.println(aa);
    }
}
