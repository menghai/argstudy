package sortarg;

/**
 * @author haicheng.lhc@alibaba-inc.com 2021/05/30
 * @date 2021/05/30
 */

public class SelectionSort {
    public static void main(String[] args) {

        int a[] ={4, 6, 5, 3, 2, 1};
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println("");
        selectionSort(a,a.length);
        for (int i : a) {
            System.out.print(i);
        }

    }

    public static void selectionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n - 1; ++i) {
            int k = i;
            for (int j = k + 1; j < n; ++j) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }

            if (k != i) {
                int tmp = a[i];
                a[i] = a[k];
                a[k] = tmp;
            }
        }


    }

}
