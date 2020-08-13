package Codes;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(array[1]);
    }
}
