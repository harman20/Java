package Codes;

import java.util.HashSet;
import java.util.Scanner;

public class TripletsWithSumZero {
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
        boolean flag=false;
        for (int i=0;i<array.length-1;i++){
            HashSet<Integer> hashSet=new HashSet<>();
            for (int j=i+1;j<array.length;j++){
                int num=-(array[i]+array[j]);
                if (hashSet.contains(num)){
//                    System.out.println(num+" "+array[i]+" "+array[j]);
                    flag=true;
                }
                else
                    hashSet.add(array[j]);
            }
        }
        if (!flag)
            System.out.println("0");
        else
            System.out.println(1);
    }
}
