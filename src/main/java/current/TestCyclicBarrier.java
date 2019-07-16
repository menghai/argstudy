package current;

import java.util.concurrent.CyclicBarrier;

/**
 * @author haicheng.lhc@alibaba-inc.com 2019/06/20
 * @date 2019/06/20
 */

public class TestCyclicBarrier {
    public static void main(String[] args) {
        Integer carNum = 10;

        CyclicBarrier cyclicBarrier = new CyclicBarrier(carNum, new Runnable() {
            @Override
            public void run() {
                try{

                    Thread.sleep(6000);
                }catch (Exception e){

                }
                System.out.println("车辆全部准备就绪，出发 num= "+ carNum);
            }
        });

        for (Integer i = 1; i <= carNum; ++i) {

            Integer car = i;

            new Thread(()-> {

                try {

                    System.out.println("第" + car + "辆车已经就绪！");

                    cyclicBarrier.await();

                    System.out.println("第" + car + "辆车出发 gogo！");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }).start();

        }
    }
}
