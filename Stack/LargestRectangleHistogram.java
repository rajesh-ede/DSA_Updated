package Stack;

public class LargestRectangleHistogram {
    public static int Hisogram(int[] heights){
        int n = heights.length;
        int Area = 0;                                      // LeetCode 84
        for(int i = 0; i < n; i++){
            int minHeight = Integer.MAX_VALUE;
            for(int j = i; j < n; j++){
                minHeight = Math.min(minHeight,heights[j]);

                Area = Math.max(Area,minHeight * (j-i+1));
            }
        }
        return Area;
    }
    public static void main(String[] args) {
        int heights[] = {2, 1, 5, 6, 2, 3};
        System.out.println(Hisogram(heights));
    }
}
