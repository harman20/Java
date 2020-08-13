package Codes;

import java.util.Scanner;

public class RotateLinkedList {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    static void append(int d) {
        Node newnode = new Node(d);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    static void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    static void rotate(int k){
        Node temp=head;
        int num=1;
        while (temp!=null && num<k) {
            temp = temp.next;
            num++;
        }
        Node knode=temp;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head=knode.next;
        knode.next=null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] arr=input.split(" ");
        for (int i=0;i<arr.length;i++){
            append(Integer.parseInt(arr[i]));
        }
        display();
        System.out.println();
        int k=sc.nextInt();
        rotate(k);
        display();
    }
}
