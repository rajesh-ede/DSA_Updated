package Graphs;
import java.util.*;

public class Bfs {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj , int S){
    ArrayList<Integer> ans = new ArrayList<>();
    Queue<Integer> q = new LinkedList<>();
    boolean []visit = new boolean[S];

    int src = 0;
     visit[src] = true;
    q.add(src);
   

    while(!q.isEmpty()){
        int curr = q.poll();
        ans.add(curr);

        for(int x : adj.get(curr)){
            if(!visit[x]){
                visit[x] = true;
                q.add(x);
            }
        }
    }

    return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  nodes for graph : ");
        int size = sc.nextInt();
        System.out.println("Enter the number of edges for edges : ");
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int i = 0; i < size; i++){
            arr.add(new ArrayList<>());
        }
        for(int i = 0; i < E; i++ ){
            int u = sc.nextInt();
            int v = sc.nextInt();

            arr.get(u).add(v);
            arr.get(v).add(u);
        }
        ArrayList<Integer> list = bfs(arr, size);

        System.out.println("BFS Traversal : ");

        for(int x : list){
            System.out.print(x + " ");
        }
        sc.close();
    }
}
