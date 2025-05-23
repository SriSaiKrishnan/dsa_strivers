package arrays04;

/*

Given an array containing both positive and negative integers, we have to find the length of the longest subarray with the sum of all elements equal to zero.

Examples

Example 1:
Input Format: N = 6, array[] = {9, -3, 3, -1, 6, -5}
Result: 5
Explanation: The following subarrays sum to zero:
{-3, 3} , {-1, 6, -5}, {-3, 3, -1, 6, -5}
Since we require the length of the longest subarray, our answer is 5!

Example 2:
Input Format: N = 8, array[] = {6, -2, 2, -8, 1, 7, 4, -10}
Result: 8
Subarrays with sum 0 : {-2, 2}, {-8, 1, 7}, {-2, 2, -8, 1, 7}, {6, -2, 2, -8, 1, 7, 4, -10}
Length of longest subarray = 8

Example 3:
Input Format: N = 3, array[] = {1, 0, -5}
Result: 1
Subarray : {0}
Length of longest subarray = 1

Example 4:
Input Format: N = 5, array[] = {1, 3, -5, 6, -2}
Result: 0
Subarray: There is no subarray that sums to zero

 */

import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {

    public static void main(String[] args) {

        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        longestSubarray(arr);

    }

    private static void longestSubarray(int[] arr) {

        int sum = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];

            if(sum == 0)
                max = i +1;
            else if(map.containsKey(arr[i]))
            {
                max = Math.max(max, i - map.get(arr[i]));
            }
            else
            {
                map.put(sum, i);
            }
        }

        System.out.println(max);

    }

}
