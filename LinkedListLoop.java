package Codes;

import java.util.Scanner;

public class LinkedListLoop {
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

    static boolean detectloop() {
        Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("loop present");
                return true;
            }
            else System.out.println("loop not present");
        }
        return false;
    }

    static void createaloop(Node temp, int node) {
        int i = 0;
        Node last = temp;
        Node value = temp;
        while (last.next != null) {
            last = last.next;
        }
        while (value.next != null && i < node) {
            value = value.next;
        }
        if (value==temp)
        last.next = null;
        else last.next=value;
    }

    static void display() {
        Node print = head;
        while (print.next != null) {
            System.out.print(print.data + " ");
            print = print.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListLoop obj = new LinkedListLoop();
//        System.out.println("enter number of testcases");
//        int t = sc.nextInt();
        int element = 0;
        int node = 0;
//        for (int j = 0; j < t; j++) {
            System.out.println("enter length");
            int length = sc.nextInt();
            System.out.println("enter elements");
            for (int i = 0; i < length; i++) {
                append(sc.nextInt());
            }
            System.out.println("enter which node is connected to last node");
            node = sc.nextInt();
            createaloop(head, node);
            System.out.println("output--> " + detectloop());
        }
    }
