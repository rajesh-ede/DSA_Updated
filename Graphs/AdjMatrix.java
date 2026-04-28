package Graphs;

import java.util.Scanner;

public class AdjMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of Nodes : ");
        int n = sc.nextInt();
        System.out.print("No of Edges : ");
        int m = sc.nextInt();

        int [][] matrix = new int[n+1][n+1];

        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }
        System.out.println("Adjcent Matrix is : ");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n ;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
