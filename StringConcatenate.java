package Codes;

import java.util.HashMap;
import java.util.Scanner;

public class StringConcatenate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            String s=sc.next();
            String r=sc.next();
            function(s, r);
        }
    }
    static void function(String s, String r){
        String result="";
        HashMap<Character, Integer> hashMap=new HashMap<>();
        for (int i=0;i<r.length();i++){
            hashMap.put(r.charAt(i), 1);
        }
        for (int i=0;i<s.length();i++){
            if (!hashMap.containsKey(s.charAt(i))){
                result=result+s.charAt(i);
            }
            else
                hashMap.put(s.charAt(i), 2);
        }
        for (int i=0;i<r.length();i++){
            if (hashMap.get(r.charAt(i))==1)
                result=result+r.charAt(i);
        }
        System.out.println(result);
        return;
    }
}
