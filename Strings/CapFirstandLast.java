package Strings;

public class CapFirstandLast {
// Capitalize first and last character of each word
    private static String Capital(String s){
        char c[] = s.toCharArray();
        int start = 0;
        int n = s.length();
        while(start < n){
            while(start < n && s.charAt(start) == ' ')
                start++;
            if(start >= n){
                break;
            }
            int end = start;
            while(end < n && s.charAt(end) != ' ')
                end++;
            if(Character.isLowerCase(c[start])){
                c[start] = Character.toUpperCase(c[start]);
            }
            if(end-1 > start && Character.isLowerCase(c[end-1])){
                c[end-1] = Character.toUpperCase(c[end-1]);
            }
            start = end;
        }
        return new String(c);
    }
    public static void main(String[] args) {
        String s = "I am Best";
        System.out.println(Capital(s));
    }
    
}
