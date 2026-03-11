
package LeetCode.March2026;
public class day11 {
    public static int bitwiseComplement(int n){
        String bin = Integer.toBinaryString(n);
        StringBuilder st = new StringBuilder();
        for(char c : bin.toCharArray()){
            if(c == '0'){
                st.append("1");
            }else{
                st.append("0");
            }
        }
          return Integer.parseInt(st.toString(),2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(bitwiseComplement(n));
    }
}
