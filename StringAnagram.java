package Codes;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.next();
        String input2=sc.next();
        System.out.println(checkAnagram(input1, input2));
    }
    static boolean checkAnagram(String s1, String s2){
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int n1=c1.length;
        int n2=c2.length;
        if (n1 != n2)
            return false;
        for (int i=0;i<n1;i++){
            if (c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }
}
