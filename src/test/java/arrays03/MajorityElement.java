package arrays03;

/*

Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.

Examples

Example 1:
Input Format: N = 3, nums[] = {3,2,3}
Result: 3
Explanation: When we just count the occurrences of each number and compare with half of the size of the array, you will get 3 for the above solution.

Example 2:
Input Format:  N = 7, nums[] = {2,2,1,1,1,2,2}

Result: 2

Explanation: After counting the number of times each element appears and comparing it with half of array size, we get 2 as result.

Example 3:
Input Format:  N = 10, nums[] = {4,4,2,4,3,4,4,3,2,4}

Result: 4

 */

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int n = 3;
        int[] nums = {3,2,3};
        majorityElement(n,nums);
    }

    private static void majorityElement(int n, int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int mid = nums.length / 2;
        int max = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], map.getOrDefault(map.get(nums[i]), 1));
            if(map.get(nums[i])>mid && nums[i]>max)
                max = nums[i];
        }

        System.out.println(max);

    }

}
