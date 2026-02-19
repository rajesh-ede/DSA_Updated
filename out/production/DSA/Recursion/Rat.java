package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Rat {
    public static  boolean isSafe(int x, int y,int[][] grid, boolean [][]visited){
        int n = grid.length;
        return (x >= 0 && x < n && y >= 0 && y < n && !visited[x][y] && grid[x][y] == 1);
    }
    public static List<String> findpath(int[][] grid){
        int n = grid.length;
        List<String> res = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        boolean[][] visited = new boolean[n][n];
        if(n == 0 || grid[0][0] == 0) return res;

        solve(0,0,grid,visited,path,res);
     return res;
    }
    public static void solve(int x, int  y, int[][] grid, boolean[][] visited, StringBuilder path, List<String> res){
        int n = grid.length;


        if(x == n-1 && y == n-1){
            res.add(path.toString());
        }

        visited[x][y] = true;

        if(isSafe(x+1,y,grid,visited)){
            path.append('D');
            solve(x+1,y,grid,visited,path,res);
            path.deleteCharAt(path.length()-1);
        }
        if(isSafe(x,y-1,grid,visited)){
            path.append('L');
            solve(x,y-1,grid,visited,path,res);
            path.deleteCharAt(path.length()-1);
        }
        if(isSafe(x,y+1,grid,visited)){
            path.append('R');
            solve(x,y+1,grid,visited,path,res);
            path.deleteCharAt(path.length()-1);
        }
        if(isSafe(x-1,y,grid,visited)){
            path.append('U');
            solve(x-1,y,grid,visited,path,res);
            path.deleteCharAt(path.length()-1);
        }
    }
    public static void main(String[] args) {
     int grid[][] ={ {1,0,0,0},
             {1,1,0,0},
             {0,1,0,0},{0,1,1,1}};
     List<String> path = findpath(grid);

     for(String pair : path){
         System.out.println(pair + "");
     }
    }
}
