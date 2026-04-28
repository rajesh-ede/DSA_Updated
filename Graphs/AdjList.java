package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjList {
        public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("No of Nodes");
       int n = sc.nextInt();
       System.out.print("No of Edges");
       int m = sc.nextInt();
       
       List<Integer> []adj = new ArrayList[n+1];
     
       for(int i = 0; i <= n; i++){
           adj[i] = new ArrayList<>();
       }
       for(int i = 0; i < m; i++){
           int u = sc.nextInt();
           int v = sc.nextInt();
           adj[u].add(v);
           adj[v].add(u); // we eliminate this for directed graph
       }
       
       System.out.println("Adjecent List ; ");
       for(int i = 1; i <= n; i++){
           System.out.print(i + " --> ");
           for(int ne : adj[i]){
           System.out.print(ne + " ");
         }
         System.out.println();
       }
       
       sc.close();
    }
    
}
