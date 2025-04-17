package arrays02;

/*

You are given a read-only array of N integers with values also in the range [1, N] both inclusive. Each integer appears exactly once except A which appears twice and B which is missing. The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.

Examples

Example 1:
Input Format:  array[] = {3,1,2,5,3}
Result: {3,4)
Explanation: A = 3 , B = 4
Since 3 is appearing twice and 4 is missing

Example 2:
Input Format: array[] = {3,1,2,5,4,6,7,5}
Result: {5,8)
Explanation: A = 5 , B = 8
Since 5 is appearing twice and 8 is missing

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindRepeatingMissing {

    public static void main(String[] args) {

        int[] arr = {3,1,2,5,3};
        findRepeatingMissing(arr);

    }

    private static void findRepeatingMissing(int[] arr) {

        Arrays.sort(arr);

        Set<Integer> set = new HashSet<>();
        boolean flag1 = true;
        int[] a = new int[2];

        for (int i=0; i<arr.length; i++)
        {
            if(set.contains(arr[i]) && flag1)
            {
                a[0] = arr[i];
                flag1 = false;
            }
            else
                set.add(arr[i]);
        }

        for(int i=1; i<=arr.length; i++)
        {
            if(!set.contains(i))
               a[1] = i;
        }

        System.out.println("Duplicate " + a[0] + " Missing " + a[1]);

    }

}
