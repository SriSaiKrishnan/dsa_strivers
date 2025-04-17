package arrays03;

/*

Given an array of N integers. Find the elements that appear more than N/3 times in the array. If no such element exists, return an empty vector.

Pre-requisite: Majority Element(>N/2 times)

Examples

Example 1:
Input Format: N = 5, array[] = {1,2,2,3,2}
Result: 2
Explanation: Here we can see that the Count(1) = 1, Count(2) = 3 and Count(3) = 1.Therefore, the count of 2 is greater than N/3 times. Hence, 2 is the answer.

Example 2:
Input Format:  N = 6, array[] = {11,33,33,11,33,11}
Result: 11 33
Explanation: Here we can see that the Count(11) = 3 and Count(33) = 3. Therefore, the count of both 11 and 33 is greater than N/3 times. Hence, 11 and 33 is the answer.

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Majority3Elements {

    public static void main(String[] args) {

        int n = 6;
        int[] arr = {1,2,2,3,2};
        majority3Elements(arr,n);

    }

    private static void majority3Elements(int[] arr, int n) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i], map.getOrDefault(arr[i], 1));
            }
            if(map.get(arr[i]) > n/3 && !list.contains(arr[i]))
            {
                list.add(arr[i]);
            }
        }

        System.out.println(list);

    }

}
