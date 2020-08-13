package Codes;

import java.util.Scanner;

public class SubMatrixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] array=new int[rows][cols];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                array[i][j]=sc.nextInt();
            }
        }
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        r1--;
        c1--;
        r2--;
        c2--;
        int sum=0;
        for (int i=r1;i<=r2;i++){
            for (int j=c1;j<=c2;j++){
                sum=sum+array[i][j];
            }
        }
        System.out.println(sum);
    }
}
