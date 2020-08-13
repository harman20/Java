package Codes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListCombine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List[] array=new List[n];
        try {
            for (int i = 0; i < n; i++) {
                LinkedList<Integer> list = new LinkedList<>();
                while (true) {
                    String input = sc.nextLine();
                    String[] s = input.split(" ");
                    if (input.endsWith("")) {
                        if (!input.equals("")) {
                            for (int j = 0; j < s.length; j++) {
                                list.add(Integer.parseInt(s[i]));
                            }
                            array[i] = list;
                            break;
                        }
                    }
                }
            }
            LinkedList<Integer> output = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                output.addAll(array[i]);
            }
            Collections.sort(output);
            for (int i = 0; i < output.size(); i++) {
                if (i == output.size() - 1) {
                    System.out.print(output.get(i));
                } else System.out.print(output.get(i) + "->");
            }
        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }
    }
}
