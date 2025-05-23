package arrays02;

/*

Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.

Examples

Example 1:

Input:
n = 4, arr1[] = [1 4 8 10]
m = 5, arr2[] = [2 3 9]

Output:
arr1[] = [1 2 3 4]
arr2[] = [8 9 10]

Explanation:
After merging the two non-decreasing arrays, we get, 1,2,3,4,8,9,10.

Example2:

Input:
n = 4, arr1[] = [1 3 5 7]
m = 5, arr2[] = [0 2 6 8 9]

Output:
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]

Explanation:
After merging the two non-decreasing arrays, we get, 0 1 2 3 5 6 7 8 9.

 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoSorted {

    public static void main(String[] args) {
        int[] arr1 = {1,4,8,10};
        int[] arr2 = {2,3,9};
        mergeTwoSortedArray(arr1, arr2);

    }

    private static void mergeTwoSortedArray(int[] arr1, int[] arr2) {
      int n = arr1.length + arr2.length;
      int[] a = new int[n];
      int i=0;
      int j = 0;

      while (i<arr1.length)
      {
          a[i] = arr1[i];
          i++;
      }
      while (j<arr2.length)
      {
          a[i] = arr2[j];
          j++;
          i++;
      }

      Arrays.sort(a);

      i=0;
      j=0;
      while (i<arr1.length)
      {
          arr1[i] = a[i];
          i++;
      }
      while (i<n)
      {
          arr2[j] = a[i];
          i++;
          j++;
      }

    }


}
