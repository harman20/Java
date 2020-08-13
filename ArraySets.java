package Codes;

import java.util.Scanner;

public class ArraySets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int choice=sc.nextInt();
        if (choice>size)
            System.out.println("not possible");
        else {
            System.out.print("[");
            for (int i = 0; i < size; i=i+2) {
                for (int j=i+1;j<size;j=j+2) {
                    if (size % choice == 0) {
                        System.out.print("("+array[i]+", "+array[j]+"), ");
                        break;
                    }
                }
            }
            System.out.print("]");
        }
    }
}
