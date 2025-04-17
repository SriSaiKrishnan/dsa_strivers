package arrays03;

/*

Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */

public class Power {

    public static void main(String[] args) {
        double x = 2.10000;
        int n  = 3;
        myPow(x,n);
    }

    private static void myPow(double x, int n) {
        double power = 1;
        int i=0;
        if(n>0)
        {
            while (i<n)
            {
                power *= x;
                i++;
            }
        }
        else
        {
            n = -1 * n;
            while (i<n)
            {
                power *= x;
                i++;
            }
            power = 1 / power;
        }

        System.out.println(power);

    }

}
