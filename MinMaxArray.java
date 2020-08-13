package Codes;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arraymin=s.split(" ");
        String[] arraymax=s.split(" ");
        Arrays.sort(arraymin);
        for (int i=0;i<arraymax.length;i++){
            for (int j=i+1;j<arraymax.length;j++){
                if (Integer.parseInt(arraymax[i])<Integer.parseInt(arraymax[j])){
                    String temp=arraymax[i];
                    arraymax[i]=arraymax[j];
                    arraymax[j]=temp;
                }
            }
        }
        int[] output=new int[arraymin.length];
        int j=0;
        for (int i=0;i<output.length;i=i+2){
            output[i]=Integer.parseInt(arraymin[j]);
            j++;
        }
        j=0;
        for (int x=1;x<output.length;x=x+2){
            output[x]=Integer.parseInt(arraymax[j]);
            j++;
        }
        for (int value : output) {
            System.out.print(value + " ");
        }
    }
}
