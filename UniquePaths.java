package Codes;

import java.util.Scanner;

public class UniquePaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] matrix=new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(uniquePath(matrix));
        sc.close();
    }
    static int uniquePath(int[][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] output=new int[rows][cols];
        output[0][0]=1;
        for (int i=1;i<cols;i++){
            if (matrix[0][i]==1) {
                output[0][i] = 0;
            }
            else
                output[0][i]=output[0][i-1];
        }
        for (int i=1;i<rows;i++){
            if (matrix[i][0]==1) {
                output[i][0] = 0;
            }
            else
                output[i][0]=output[i-1][0];
        }
        for (int i=1;i<rows;i++){
            for (int j=1;j<cols;j++){
                if (matrix[i][j]==1){
                    output[i][j]=0;
                }
                else {
                    output[i][j] = output[i - 1][j] + output[i][j - 1];
                }
            }
        }
        return output[rows-1][cols-1];
    }
}
