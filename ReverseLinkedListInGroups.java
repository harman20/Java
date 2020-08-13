package Codes;
import java.util.Scanner;

public class ReverseLinkedListInGroups {
        static  Node head;
        static class Node{
            int data;
            Node next;
            Node(int d){
                data=d;
                next=null;
            }
        }
        static ReverseLinkedListInGroups addEnd(ReverseLinkedListInGroups temp, int d){
//        temp is an already created linked list
//        creating a new node
            Node newNode=new Node(d);
//        checking if linked list exists or not
            if (head==null)
//            if head is null meaning no linked list available
//            so making head point to newly created node
                head=newNode;
            else {
//            creating a reference variable for head to traverse
                Node last=head;
//            to insert at the end so traversing until null
                while (last.next!=null){
//                changing last until null is received
                    last=last.next;
                }
                last.next=newNode;
            }
            return temp;
        }
        void display(ReverseLinkedListInGroups temp){
            Node ptr=temp.head;
            while (ptr.next!=null){
//            head is not null meaning list is not empty
                System.out.print(ptr.data+" ");
//            printing the data part and traversing the list
                ptr=ptr.next;
//            traversing links
            }
            System.out.print(ptr.data);
        }
        static Node reverse(Node temp, int k){
            Node prev=null;
            Node present=temp;
            Node next=null;
            int i=0;
            while (present!=null && i<k){
                next=present.next;
                present.next=prev;
                prev=present;
                present=next;
                i++;
            }
            if (next!=null){
                head.next=reverse(next,k);
            }
            return prev;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            ReverseLinkedListInGroups list=new ReverseLinkedListInGroups();
                        System.out.println("Enter the element(-1 to exit)");
                        int element=sc.nextInt();
                        while (element!=-1){
                            addEnd(list, element);
                            element=sc.nextInt();
                        }
                        list.display(list);
            System.out.println("\nenter value of k");
            int k=sc.nextInt();
                        System.out.println("Linked list after reversing is:");
                        head=reverse(head, k);
                        list.display(list);
        }
    }
