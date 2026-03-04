package March2026;
// 1582. Special Positions in a Binary Matrix
public class day4 {
    private static int Count (int[][] mat){
      int m = mat.length;
     int n = mat[0].length;
     int rowCount[] = new int[m];
     int colCount[] = new int[n]; 
     for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(mat[i][j] == 1){
                rowCount[i]++;
                colCount[j]++;
            }
        }
     }
     int count = 0;
     for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(mat[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1){
             count++;
            }
        }
     }
            return count;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,0,0},{0,1,0},{0,0,1}};
        int ans = Count(mat);
        System.out.println(ans);
    }
}
