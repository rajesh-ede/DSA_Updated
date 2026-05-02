package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
     public static void dfsGraph(int node,boolean vist[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res){
        
        vist[node] = true;
        res.add(node);
        
        for(int x : adj.get(node)){
            if(!vist[x]){
                dfsGraph(x,vist,adj,res);
            }
        }
    }
    public static ArrayList<Integer> dfs(int S, ArrayList<ArrayList<Integer>> adj ){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean []visit = new boolean[S];
        
        dfsGraph(0,visit,adj,ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes : ");
        int node = sc.nextInt();
        System.out.println("Enter the number of edges : "  );
        int E = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < node; i++){
            adj.add(new ArrayList<>());
        }
        System.out.println("Enter the edges Connections : ");
        for(int i = 0; i < E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u); // for directed graph we are elimanted this part
        }
        ArrayList<Integer> ans = dfs (node, adj);
        
        System.out.println("DFS Traversal : ");
        
        for(int v : ans){
            System.out.print(v + " ");
        }
        sc.close();
    }
    
}
