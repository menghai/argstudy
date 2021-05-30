package sortarg;

/**
 * @author haicheng.lhc@alibaba-inc.com 2019/07/15
 * @date 2019/07/15
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 3, 2, 1};
        bubbleSort(a, a.length);
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
    }

    public static void bubbleSort(int[] a, int n) {

        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; ++i) {
            boolean flag = false;
            for (int j = 0; j < n - 1 - i; ++j) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true;
                }
            }
            for (int m = 0; m < a.length; ++m) {
                System.out.print(a[m]);
            }
            System.out.println();
            if (!flag) {
                return;
            }
        }

    }
}
