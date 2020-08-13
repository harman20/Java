package Codes;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++) {
            String input = sc.next();
            System.out.println(palindrome(input));
        }
    }
    static boolean palindrome(String input){
        int left=0;
        int right=input.length()-1;
        input=input.toUpperCase();
        while (left<=right){
            char cleft=input.charAt(left);
            char cright=input.charAt(right);
            if (!(cleft >= 'a' && cleft <= 'z')){
                left++;
            }
            else if (!(cright >= 'a' && cright <= 'z')){
                right--;
            }
            else if (cleft==cright){
                left++;
                right--;
            }
            else
                return false;
        }
        return true;
    }
}
