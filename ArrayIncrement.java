package Codes;

import java.util.Scanner;

public class ArrayIncrement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] array=input.split(" ");
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i].equals(array[j])){
                    int value=Integer.parseInt(array[j]);
                    value++;
                    array[j]=String.valueOf(value);
                }
            }
            System.out.print(array[i]+" ");
        }
    }
}
