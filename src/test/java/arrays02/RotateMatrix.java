package arrays02;

/*
Given a matrix, your task is to rotate the matrix 90 degrees clockwise.

Example 1:

Input: [[1,2,3],[4,5,6],[7,8,9]]

Output: [[7,4,1],[8,5,2],[9,6,3]]

Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix.

Example 2:

Input: [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]

Output:[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

Explanation: Rotate the matrix simply by 90 degree clockwise and return the matrix

 */

public class RotateMatrix {

    public static void main(String[] args) {
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotateMatrix(arr);
    }

    private static void rotateMatrix(int[][] arr) {

        int a[][] = new int[arr.length][arr[0].length];
        int r = 0;
        int c = 0;
        for(int row=arr.length-1; row>=0; row--)
        {
            for (int col=0; col<arr[0].length; col++)
            {
               a[r][c] = arr[row][col];
                r++;
            }
            c++;
            r = 0;
        }

        for(int i=0; i<a.length; i++)
        {
            for (int j=0; j<a.length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

}
