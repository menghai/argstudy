package sortarg;

/**
 * @author haicheng.lhc@alibaba-inc.com 2021/05/30
 * @date 2021/05/30
 */

public class MergeSort {

    public static void main(String[] args) {
        int a[] ={4, 6, 5, 3, 2, 1};
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println("");
        mergeSortC(a,0,a.length-1);
        for (int i : a) {
            System.out.print(i);
        }
    }

    public static int[] mergeSortC(int[] a, int low, int high){
        int middle = (low+high)/2;
        if(low < high){
            mergeSortC(a, low, middle);
            mergeSortC(a, middle+1, high);
            merge(a, low, middle,high);
        }
        return a;

    }
    public static void merge(int[] a, int low, int middle, int high){
        int[] temp = new int[high-low+1];
        int i = low;
        int j = middle+1;
        int k = 0;
        while(i <= middle && j <= high){
            if(a[i] <=a[j]){
                temp[k++] = a[i++];
            }
            else{
                temp[k++] = a[j++];
            }
        }
        while(i<=middle){
            temp[k++] = a[i++];
        }
        while(j<=high){
            temp[k++] =a[j++];
        }

        for(int x = 0; x<temp.length;++x){
            a[low+x] = temp[x];
        }

    }

}
