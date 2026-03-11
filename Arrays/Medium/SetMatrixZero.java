package Arrays.Medium;

public class SetMatrixZero {
    public static void Zeros(int [][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        boolean zero = false;
        for(int i = 0; i < n; i++){
            
            if(matrix[i][0] == 0) zero = true;
            for(int j = 0; j < m; j++){
               if(matrix[i][j] == 0){
                matrix[i][0] = 0;
                matrix[0][j] = 0;
               }
            }
        }
        for(int i = n-1; i>= 0; i--){
            for(int j = m-1; j>= 0; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
             if(zero){
                matrix[i][0] = 0;
             }
        }
       
    }
    public static void main(String[] args) {
        int nums[][] = {{1,1,1},{1,0,1},{1,1,1}};
        Zeros(nums);
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
