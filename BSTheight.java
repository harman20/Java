package Codes;
import java.util.Scanner;
public class BSTheight {
    public  static class Node{
        int data;
        Node left;
        Node right;
        Node(int temp){
            data=temp;
            left=right=null;
        }
    }
    BSTheight(){
        root=null;
    }
    BSTheight(int data){
        root=new Node(data);
    }
    static Node root;
    public static void inOrder(Node root){
        if (root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        return;
    }
    public static void insert(int d){
        root=insertItem(root,d);
    }
    public static Node insertItem(Node root, int data){
        if (root==null){
            root=new Node(data);
            return root;
        }
        else if (root.data>data)
            root.left=insertItem(root.left,data);
        else if (root.data<data)
            root.right=insertItem(root.right,data);
        return root;
    }
    static int count=0;
    static int count1=0;
    public static int height(Node temp){
        if (temp==null)
            return 0;
        else if (temp.left!=null){
            height(temp.left);
            count++;
        }
        return count;
    }
    public static int height1(Node temp){
        if (temp==null)
            return 0;
        else if (temp.right!=null){
            height1(temp.right);
            count1++;
        }
        return count1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BSTheight tree=new BSTheight();
        System.out.println("ENTER YOUR CHOICE:(-1 to exit)\n1. Adding the elements" +
                "\n2. In-Order traversal\n3. Height of the tree");
        int choice=sc.nextInt();
        while (choice!=-1){
            switch (choice){
                case 1:
                    System.out.println("ADDING ELEMENTS IN THE TREE...");
                    insert(90);
                    insert(60);
                    insert(110);
                    insert(35);
                    insert(70);
                    insert(30);
                    insert(37);
                    System.out.println("ELEMENTS INSERTED SUCCESSFULLY");
                    break;
                case 2:
                    System.out.print("IN-ORDER TRAVERSAL\t\t");
                    inOrder(root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("HEIGHT OF THE TREE IS: ");
                    int height=height(root);
                    int height1=height1(root);
                    if (height>height1)
                        System.out.print(height);
                    else if (height1>height)
                        System.out.print(height1);
                    else if (height==height1)
                        System.out.print(height);
                    break;
                default:
                    System.out.println("WRONG CHOICE!! ENTER AGAIN");
            }
            choice=sc.nextInt();
        }
    }
}
