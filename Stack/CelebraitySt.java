package Stack;
import java.util.Stack;
public class CelebraitySt {
    static int Celebarity(int mat[][]){
        int n = mat.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++)
            st.push(i);
        while(st.size() > 1){
            int a = st.peek();              // Time Complexity O(n)
            st.pop();                      // Space Complexity O(n)
            int b = st.peek();
            st.pop();
            if(mat[a][b] != 0){
                st.push(b);
        }else {
                st.push(a);
            }
        }
        int c = st.peek();
        st.pop();
        for(int i = 0; i < n; i++){
            if(i == c) continue;
            if(mat[c][i] != 0 && mat[i][c] == 0)
                return -1;
        }
        return c;
    }
    public static void main(String[] args) {
  int mat[][] = {{1,1,1},
          {0,1,1},
          {0,1,1}};
  System.out.println(Celebarity(mat));
    }
}
/*
A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some
people. A square matrix mat[][] of size n*n is used to represent people at the party such that if an element of row i
and column j is set to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party, if the celebrity does not exist, return -1
 */
