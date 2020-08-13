package Codes;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] array=new int[size];
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int a=0,b=0,c=0;
        boolean flag=false;
        for (int i=0;i<size;i++){
            for (int j=i+1;j<size;j++){
                for (int k=j+1;k<size;k++){
                    a=(int)Math.pow(array[i],2);
                    b=(int)Math.pow(array[j],2);
                    c=(int)Math.pow(array[k],2);
                    if (a==b+c || b==a+c || c==a+b){
                        System.out.println(a+" "+b+" "+c);
                        flag=true;
                    }
//                    else flag=false;
                }
            }
        }
        if (flag)
            System.out.println("yes");
        else System.out.println("no");
    }
}
