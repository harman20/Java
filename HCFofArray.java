package Codes;

import java.util.Scanner;

public class HCFofArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int hcf= function(array);
        System.out.println(hcf);
    }
    static int function(int[] array){
        int hcf=array[0];
        for (int i=1;i<array.length;i++){
            hcf=gcd(array[i], hcf);
            if (hcf==1)
                return 1;
        }
        return hcf;
    }
    static int gcd(int a, int b){
        if (a==0)
            return b;
        return gcd(b%a, a);
    }
}
