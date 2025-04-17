package arrays01;

/*

Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

Examples
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Input: nums = [2,0,1]
Output: [0,1,2]

Input: nums = [0]
Output: [0]

 */

public class SortNumber {

    public static void main(String[] args) {
        int[] nums = {0};
        sortNumber(nums);

    }

    private static void sortNumber2(int[] nums) {

    }

    //brute
    private static void sortNumber(int[] nums) {

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
                zeros++;
            if(nums[i] == 1)
                ones++;
            if(nums[i] == 2)
                twos++;
        }
        int start = 0;
        while (zeros>0)
        {
           nums[start++] = 0;
           zeros--;
        }
        while (ones>0)
        {
            nums[start++] = 1;
            ones--;
        }
        while (twos>0)
        {
            nums[start++] = 2;
            twos--;
        }

        for (int n : nums)
        {
            System.out.print(n + " ");
        }

    }


}
