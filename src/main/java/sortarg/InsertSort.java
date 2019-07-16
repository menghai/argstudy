package sortarg;

/**
 * @author haicheng.lhc@alibaba-inc.com 2019/07/15
 * @date 2019/07/15
 */

public class InsertSort {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 3, 2, 1};
        insertionSort(a, a.length);
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
    }

    public static void insertionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }

}
