public class MatrixZeros {
   public static void setZero(int[][] matrix){
    int n = matrix.length;
    int m = matrix[0].length;
     boolean zero = false;              //  Leet Code 73
    for(int i = 0; i < n; i++){         // optimal Solution
     if(matrix[i][0] == 0) zero = true; // Time Complexity O(m x n) 
     for(int j = 1; j < m; j++){        // Space Complexity O(1)
       if(matrix[i][j] == 0){
        matrix[i][0] = 0;
        matrix[0][j] = 0;
       }
     }
    }
    for(int i = n-1; i >= 0; i--){
        for(int j = m-1; j >= 0;j--){
            if(matrix[i][0] == 0 || matrix[j][0] == 0){
                matrix[i][j] = 0;
            }
        }
        if(zero){
            matrix[i][0] = 0;
        }
    }
   }



   /*
    public static void setZero(int [][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        
        boolean []row = new boolean[n];
        boolean []col = new boolean[m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;    // Basic Approach Timecomplexity O(n x m)
                     col[j] = true;  // SpaceComplexity O(n + m)

                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    } */
    public static void main(String[] args){
      int arr[][] = {{1,1,1},{1,0,1},{1,1,1}};
      setZero(arr);
      for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[0].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
      }
    }
}