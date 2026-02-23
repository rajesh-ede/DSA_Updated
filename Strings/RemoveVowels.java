package Strings;

public class RemoveVowels {
    private static String Removal(String s){
        StringBuilder res = new StringBuilder(s.length());
         for(int i = 0; i < s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                continue;
            }else{
                res.append(c);
            }
         }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "I am UnBeatable";
        System.out.println(Removal(s));
    }
}
