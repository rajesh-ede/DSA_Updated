public class MatrixZeros {
    public static void setZero(int [][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        
        boolean []row = new boolean[n];
        boolean []col = new boolean[m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;

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
    }
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