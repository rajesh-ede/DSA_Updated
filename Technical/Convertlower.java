package Technical;

public class Convertlower {
    public static void main(String[] args) {
        String s = "RAJESH";

        for(int i =0; i < s.length(); i++){
            char ch  =s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch+32);
                System.out.print(ch);
            }
        }
    }
}

/*
Write a program to Convert all uppercase letters in a string to lowercase without using any built in methods like
Lowercase().
 */