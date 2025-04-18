package arrays03;

/*

Given an array of numbers, you need to return the count of reverse pairs. Reverse Pairs are those pairs where i<j and arr[i]>2*arr[j].

Examples

Example 1:

Input: N = 5, array[] = {1,3,2,3,1)

Output: 2

Explanation: The pairs are (3, 1) and (3, 1) as from both the pairs the condition arr[i] > 2*arr[j] is satisfied.

Example 2:

Input: N = 4, array[] = {3,2,1,4}

Output: 1

Explaination: There is only 1 pair  ( 3 , 1 ) that satisfy the condition arr[i] > 2*arr[j]

 */

public class CountReversePair {

    public static void main(String[] args) {
        int[] arr = {3,2,1,4};
        countReversePair(arr);
    }

    private static void countReversePair(int[] arr) {
        int cntr = 0;
        for (int i=arr.length-1; i>0; i--)
        {
            for(int j= i-1; j>=0; j--)
            {
                if(arr[j] > arr[i]*2)
                    cntr++;
            }
        }
        System.out.println(cntr);
    }

}
