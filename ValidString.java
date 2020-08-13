package Codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        function(input);
    }
    static void function(String s){
        HashMap<Character, Integer>hashMap=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (!hashMap.containsKey(s.charAt(i)))
                hashMap.put(s.charAt(i), 1);
            else
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i))+1);
        }
        int[] array=new int[50];
        int index=0;
        for (Map.Entry<Character, Integer> entry:hashMap.entrySet()){
            array[index]=entry.getValue();
            index++;
        }
        int min=99;
        for (int i=0;i<index;i++){
            if (array[i]<min)
                min=array[i];
        }
        int count=0;
        for (int i=0;i<index;i++){
            if (array[i]>min)
                count++;
        }
        if (count>1)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
