package Codes;

import java.util.HashMap;
import java.util.Scanner;

public class MaxDistanceTwoOccurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] array=input.split(" ");
        function(array);
    }
    static void function(String[] array){
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        int dist=0;
        for (int i=0;i<array.length;i++){
            if (!hashMap.containsKey(Integer.parseInt(array[i]))){
                hashMap.put(Integer.parseInt(array[i]), i);
            }
            else
                dist=Math.max(dist, i-hashMap.get(Integer.parseInt(array[i])));
        }
        System.out.println(dist);
    }
}
