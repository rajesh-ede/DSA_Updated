package SlindingWindow;

public class OptimalNumberOfSubStringCon {
    static int SubString (String s){
        int n = s.length();
        int posA = -1, posB = -1,posC = -1;
        int count = 0;
        for(int r = 0 ; r < n; r++){
            char ch = s.charAt(r);
            if(ch == 'a') posA = r;
            if(ch == 'b') posB = r;
            if(ch == 'c') posC = r;

            if(posA != -1 && posB != -1 && posC != -1){
                int minPos = Math.min(posA,Math.min(posB,posC));
                count += (minPos+1);
            }
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
