package Recursion;

public class MColoring {
    public static boolean isSafe(int node, boolean[][] graph, int [] color, int n, int i){
        for(int j = 0; j < n; j++){
            if(graph[node][j] && color[j] == i){
                return false;
            }
        }
        return true;
    }
    public static  boolean solve(int node, boolean[][] graph, int[] color,int m, int n){

        if(node == n){
            return true;
        }

        for(int i = 1; i <= m; i++){

            if(isSafe(node,graph,color,n,i)){
               color[node] = i;
              if ( solve(node+1,graph,color,m,n)) {
                  return true;
              }
                color[node] = 0;
            }
        }
        return false;
    }
    public static  boolean graphColors(int[][] edges, int m , int n){
        boolean[][] graph = new boolean[n][n];
        int[] colors = new int[n];
        for(int[] e : edges){
            graph[e[0]][e[1]] = true;
            graph[e[1]][e[0]] = true;
        }
       return( solve(0,graph,colors,m,n));

    }
    public static void main(String[] args) {
        int n = 5, m = 3;
        int [][] edges = { {0,1},{1,2},{0,2},{2,3},{2,4},{3,4}};
        boolean colors = graphColors(edges,m,n);
        System.out.println(m + " " + colors);
    }
}
