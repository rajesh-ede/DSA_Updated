package Strings;

public class ConstantsVowelsSpaces {
    public static void Slove (String s){
         int vowels = 0, constants = 0, spaces = 0;
         s = s.toLowerCase();
         for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else if(ch >= 'a' && ch <= 'z'){
                constants++;
            }else if(ch == ' '){
                spaces++;
            }
         }
         System.out.println("vowels : " + vowels);
         System.out.println("constants : " + constants);
         System.out.println("spaces : " + spaces);
    }
    public static void main(String[] args) {
        String s = "I am Unbeatable";
          Slove(s);
    }
    
}
