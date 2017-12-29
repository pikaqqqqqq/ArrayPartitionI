import java.util.Arrays;

/**
 * Created by think on 2017/12/25.
 * <p>
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 * <p>
 * Example 1:
 * Input: [1,4,3,2]
 * <p>
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 * <p>
 * Note:
 * n is a positive integer, which is in the range of [1, 10000].
 * All the integers in the array will be in the range of [-10000, 10000].
 */


public class test {
    public static void main(String[] args) {
        int a[] = {1,2,6,7,87,334,43,212,56,-987,344,22,123,1235,667,-533,-2,-343};
        Arrays.sort(a);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            System.out.print(a[i] + " ");
        }
        //System.out.println(sum);

    }

    static void QuickSort(int a[], int low, int high) {
        int temp;
        int i = low;
        int j = high;

        if (low < high) {
            temp = a[low];
            while (i != j) {
                while (j > i && a[j] > temp)
                    --j;
                if (i < j) {
                    a[i] = a[j];
                    ++i;
                }

                while (i < j && a[i] < temp)
                    ++i;
                if (i < j) {
                    a[j] = a[i];
                    --j;
                }
            }
            a[i] = temp;
            for (int q = 0; q < a.length; q++) {
                System.out.print(a[q] + " ");
            }
            System.out.println(" ");
            QuickSort(a, 0, i - 1);
            QuickSort(a, i + 1, high);

        }
    }

}
