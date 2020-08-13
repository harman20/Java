package Codes;

import java.util.Scanner;

public class StackMinElement {
    Node top;
    static class Node{
        int data;
        Node next;
        Node(int temp){
            data=temp;
        }
    }
    void push(int key){
        Node newnode=new Node(key);
        if (newnode==null)
            System.out.println("Stack overflow");
        else {
            newnode.next=top;
            top=newnode;
        }
    }
    void display(){
        Node temp=top;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }
    void peek(){
        System.out.println(top.data);
    }
    boolean isEmpty(){
        return top==null;
    }
    void pop(){
        if (top==null)
            System.out.println("stack underflow");
        else {
            Node temp=top;
            top=temp.next;
            System.out.println("element popped");
        }
    }
    int min(){
        Node temp=top;
        int min=top.data;
        while (temp.next!=null){
            if (temp.data<min){
                min=temp.data;
            }
            temp=temp.next;
        }
        return min;
    }

    public static void main(String[] args) {
        StackMinElement stackMinElement=new StackMinElement();
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        while (element!=-1){
            stackMinElement.push(element);
            element=sc.nextInt();
        }
        stackMinElement.display();
        System.out.println("\n"+stackMinElement.min());
    }
}
