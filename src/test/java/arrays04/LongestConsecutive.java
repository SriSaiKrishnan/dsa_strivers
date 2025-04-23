package arrays04;

/*

You are given an array of ‘N’ integers. You need to find the length of the longest sequence which contains the consecutive elements.

Examples

Example 1:

Input: [100, 200, 1, 3, 2, 4]

Output: 4

Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.

Input: [3, 8, 5, 7, 6]

Output: 4

Explanation: The longest consecutive subsequence is 5, 6, 7, and 8.

 */

import java.util.Arrays;

public class LongestConsecutive {

    public static void main(String[] args) {
        int[] arr = {100, 200, 1, 3, 2, 4};
        longestConsecutive(arr);
    }

    private static void longestConsecutive(int[] arr) {

        Arrays.sort(arr);
        int cntr = 1;
        int max = 0;

        for( int i=0; i<arr.length-1; i++)
        {
            if(arr[i+1] - arr[i] == 1)
                cntr++;
            else
                cntr = 1;
            if(cntr > max)
                max  = cntr;
        }

        System.out.println(max);

    }

}
