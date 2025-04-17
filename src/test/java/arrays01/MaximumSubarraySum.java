package arrays01;

/*

Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray.

Examples
Example 1:

Input: arr = [-2,1,-3,4,-1,2,1,-5,4]

Output: 6

Explanation: [4,-1,2,1] has the largest sum = 6.

Examples 2:

Input: arr = [1]

Output: 1

Explanation: Array has only one element and which is giving positive sum of 1.

 */

public class MaximumSubarraySum {

    public static void main(String[] args) {
        int[] nums = {-2,-3,4,-1,-2,1,-5,-3};
        maximumSubarraySum(nums);
    }

    private static void maximumSubarraySum(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++)
        {
            int sum = 0;
            for (int j=i; j<nums.length; j++)
            {
                sum += nums[j];
                max = Math.max(max,sum);
            }
        }
        System.out.println(max);
    }

}
