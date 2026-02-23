package SlindingWindow;

public class OptimalLongest {
    static int logest(String s){
        int l = 0, r =0, res = 0;
        boolean vis[] = new boolean[26];
        while(r < s.length()){

            while(vis[s.charAt(r) - 'a'] == true){
                vis[s.charAt(l)-'a'] = false;                       // Time Complexity O(n)
                  l++;                                              // Space ComplexityO(1)
            }
            vis[s.charAt(r) - 'a'] = true;
            res = Math.max(res, r - l + 1);
            r++;
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(logest(s));
    }
}
