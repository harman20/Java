package Codes;

import java.util.Scanner;

public class SubArrayEqualSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        function(array);
    }
    static void function(int[] array){
        int point=splitPoint(array);
        if (point==-1 || point==array.length){
            System.out.println("not possible");
            return;
        }
        for (int i=0;i<array.length;i++){
            if (point==i)
                System.out.println();
            System.out.print(array[i]);
        }
    }
    static int splitPoint(int[] array){
        int left=0;
        for (int i=0;i<array.length;i++){
            left=left+array[i];
        }
        int right=0;
        for (int i=array.length-1;i>=0;i--){
            right=right+array[i];
            left=left-array[i];
            if (left==right)
                return i;
        }
        return -1;
    }
}
