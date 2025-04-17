package arrays02;

/*

Given an array of N + 1 size, where each element is between 1 and N. Assuming there is only one duplicate number, your task is to find the duplicate number.

Examples:

Example 1:

Input: arr=[1,3,4,2,2]

Output: 2

Explanation: Since 2 is the duplicate number the answer will be 2.

Example 2:

Input: [3,1,3,4,2]

Output:3

Explanation: Since 3 is the duplicate number the answer will be 3.

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        findDuplicate(arr);

    }

    private static void findDuplicate(int[] arr) {

        Set<Integer> set = new HashSet<>();
        int num = 0;
        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++)
        {
            if(set.contains(arr[i]))
            {
                num = arr[i];
                break;
            }
            else
                set.add(arr[i]);
        }

        System.out.println(num);

    }

}
