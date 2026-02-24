package Strings;
// Problem: Given a string, calculate the sum of numbers in a string (multiple consecutive digits are considered one number)
public class SumOfNumber {
    private static int Sum(String s){
      int sum = 0;
      String temp = "";
      for(char c : s.toCharArray()){
        if(Character.isDigit(c)){
            temp += c;
        }else{
            if(!temp.equals("")){
                sum += Integer.parseInt(temp);
                temp = "";
            }
        }
      }
      if(!temp.equals("")){
        sum += Integer.parseInt(temp);
      }
      return sum;
    }
    public static void main(String[] args) {
        String s = "123yt3";
        System.out.println(Sum(s));
    }
    
}
