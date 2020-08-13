package Codes;

import java.util.Scanner;

public class TernaryStringToBinaryTree {
    static String s;
    static class Node{
        char data;
        Node left;
        Node right;
        Node(char d){
            data=d;
            left=right=null;
        }
    }
    static Node insert(String input){
        s=input;
        return insertData();
    }
    static Node insertData(){
        if (s==null || s.isEmpty())
            return null;
        char c=s.charAt(0);
        Node newnode=new Node(c);
        if (s.length()>1 && s.charAt(1)=='?'){
            s=s.substring(2);
            newnode.left=insert(s);
            newnode.right=insert(s);
        }
        else if (s.length()>1 && s.charAt(1)==':'){
            s=s.substring(2);
        }
        return newnode;
    }
    static void preOrder(Node temp){
        if (temp == null)
            return;
        System.out.print(temp.data + " ");
        preOrder(temp.left);
        preOrder(temp.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String s = sc.next();
        Node treeNode = insert(s);
        preOrder(treeNode);
        sc.close();
    }
}
