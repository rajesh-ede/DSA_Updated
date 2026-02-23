package Strings;

public class NumberOfSegments {
    public static int Segment(String s){
        int  count = 0;
        boolean seg = false;
        for(char c : s.toCharArray()){
           if(c != ' '&& !seg){
              count++;
              seg = true;
           }else if(c == ' '){
            seg = false;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "I am Unbeatable";
        System.out.println(Segment(s));
    }
}
