package Graphs;

import java.util.LinkedList;
import java.util.Queue;

//LeetCode 200
public class NoOfIlands {
    public static void BFS(int row, int col, int[][] visit, char[][] grid) {

    Queue<Pair> q = new LinkedList<>();

    visit[row][col] = 1;

    q.add(new Pair(row, col));

    int n = grid.length;
    int m = grid[0].length;
    
    int[] delRow = {-1, 0, 1, 0};
    int[] delCol = {0, 1, 0, -1};

    while (!q.isEmpty()) {

        int ro = q.peek().first;
        int co = q.peek().second;

        q.remove();

        for (int i = 0; i < 4; i++) {

            int nrow = ro + delRow[i];
            int ncol = co + delCol[i];

            if (nrow >= 0 && nrow < n &&
                ncol >= 0 && ncol < m &&
                visit[nrow][ncol] == 0 &&
                grid[nrow][ncol] == '1') {

                visit[nrow][ncol] = 1;

                q.add(new Pair(nrow, ncol));
            }
        }
    }
}
    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visit = new int[n][m];
        int cnt = 0;
         for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(grid[row][col] == '1' && visit[row][col] == 0){
                    cnt++;
                    BFS(row,col,visit,grid);
                }
            }
         }
         return cnt;
    }
    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        System.out.println(numIslands(grid));
    }

}

class Pair{
    int first;
    int second;
    public Pair(int first,int second){
      this.first = first;
      this.second = second;
    }
}
