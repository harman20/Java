package Codes;

import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
    static class graph{
        int vertices;//number of vertices
        LinkedList<Integer> aLA[];//adjacencyListArray
        graph(int v){//constructor
            this.vertices=v;
            aLA=new LinkedList[v];
            for (int i=0;i<v;i++){
                aLA[i]=new LinkedList<>();
            }
        }
    }
    static void addEdge(graph g, int start, int end){//adding edges to an undirected graph
        g.aLA[start].add(end);//from start to end
        g.aLA[end].add(start);//because graph is undirected
    }
    static void printGraph(graph g){
        for (int i=0;i<g.vertices;i++){
            System.out.println("Adjacency List of Vertex: "+i+1);
            System.out.print("HEAD");
            for (Integer value: g.aLA[i]){
                System.out.print(" -> "+ value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of vertices");
        int vertices=sc.nextInt();
        graph g= new graph(vertices);
        System.out.println("Enter starting and ending nodes(-1 to stop)");
        int start=sc.nextInt();
        int end=sc.nextInt();
        while (start != -1 || end != -1){
            addEdge(g, start, end);
            start=sc.nextInt();
            end=sc.nextInt();
        }
        printGraph(g);
    }
}
