package Codes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        function(array);
    }
    static void function(int[] array){
        HashMap<Integer, Integer> hashMap=new HashMap<>();
        for (int i=0;i<array.length;i++){
            if (!hashMap.containsKey(array[i])){
                hashMap.put(array[i], 1);
            }
            else
                hashMap.put(array[i], hashMap.get(array[i]++));
        }
        for (Map.Entry<Integer, Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
