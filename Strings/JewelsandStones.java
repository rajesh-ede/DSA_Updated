package Strings;

public class JewelsandStones {
    public static int numJewelsInStones ( String jewles, String stones){
        int count = 0;
        for(int i = 0; i < stones.length(); i++){
            char c = stones.charAt(i);                            //771. Jewels and Stones
            for(int j = 0; j < jewles.length(); j++){
                if(c == jewles.charAt(j)){
                 count++;
                 break;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        String s = "rajjeshj";
        String j = "ra";
        System.out.println(numJewelsInStones(s,j));
    }
    
}
