package Codes;

import java.util.Scanner;

public class MinimumPathSum {
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
        System.out.println(minPathSum(matrix));
    }
    static int minPathSum(int[][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][] output=new int[rows][cols];
        for (int i=1;i<cols;i++){
            output[0][i]=output[0][i-1]+matrix[0][i];
        }
        for (int i=1;i<rows;i++){
            output[i][0]=output[i-1][0]+matrix[i][0];
        }
        for (int i=1;i<rows;i++){
            for (int j=1;j<cols;j++){
                if (output[i-1][j]>output[i][j-1])
                    output[i][j]=output[i][j-1]+matrix[i][j];
                else
                    output[i][j]=output[i-1][j]+matrix[i][j];
            }
        }
        return output[rows-1][cols-1];
    }
}
