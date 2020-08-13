package Codes;

import java.util.Scanner;

public class LinkedListEvenOdd {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    static void append(LinkedListEvenOdd list, int d){
        Node newnode=new Node(d);
        if (list.head==null)
            list.head=newnode;
        else {
            Node ref=list.head;
            while (ref.next!=null){
                ref=ref.next;
            }
            ref.next=newnode;
        }
    }
    static String result(LinkedListEvenOdd list){
        Node temp=list.head;
        int count=0, sum=0, avg=0;
        while (temp!=null){
            sum=sum+temp.data;
            count++;
            temp=temp.next;
        }
//        System.out.println(count);
        avg=sum/count;
        if (avg%2==0)
            return "EVEN";
        else
            return "ODD";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedListEvenOdd list = new LinkedListEvenOdd();
        String element=sc.nextLine();
        String[] input=element.split(" ");
        for (String s : input) {
            int value = Integer.parseInt(s);
            append(list, value);
        }
        System.out.println(result(list));
    }
}
