package Codes;

import java.util.Scanner;

public class StringReverseWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String[] array=s.split("\\.");
        for (int i=array.length-1;i>0;i--){
            System.out.print(array[i]+".");
        }
        System.out.println(array[0]);
    }
}
