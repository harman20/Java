package Codes;

import java.util.Scanner;

public class DoublyLL_SumPairs {
    static Node head;
    static class Node{
        int data;
        Node prev, next;
        Node(int d){
            data = d;
        }
    }
    static void append(int data){
        Node newNode = new Node(data);
        Node last = head;
        if (head == null){
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (last.next != null){
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }
    public static void sumPairs(int sum){
        Node one = null, two = null;
        one = head;
        while (one != null && one.next != null){
            two = one;
            while (two.next != null){
                if (one.data + two.next.data == sum){
                    System.out.println("( "+one.data+", "+two.next.data+" )");
                    two.next = two.next.next;
                }
                else {
                    two = two.next;
                }
            }
            one = one.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements in ascending order");
        int element = sc.nextInt();
        while (element != -1){
            append(element);
            element = sc.nextInt();
        }
        System.out.println("enter sum");
        int sum = sc.nextInt();
        sumPairs(sum);
    }
}
