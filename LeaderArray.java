package Codes;

import java.util.Scanner;

public class LeaderArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        String output="";
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n-1;j++){
                if (array[i]>array[j]){
                    output=output+array[i]+" ";
                }
            }
        }
        output=output+array[n-1];
        System.out.println(output);
    }
}
