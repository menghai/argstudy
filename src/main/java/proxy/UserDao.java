package proxy;

/**
 * @author haicheng.lhc@alibaba-inc.com 2019/03/07
 * @date 2019/03/07
 */

public class UserDao implements IUserDao{
    @Override
    public void save() {
        System.out.println("----已经保存数据!----");
    }
}
