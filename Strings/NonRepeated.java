package Strings;

public class NonRepeated {
    // Optimal Approach O(n)
    private static void Optimal(String s, int n){
        int freq[] = new int [200];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                continue;
            }else{
               freq[s.charAt(i) - 'a']++;
            }
         
        }
        for(int i = 0; i < n; i++){
            if(freq[s.charAt(i) - 'a'] == 1 && s.charAt(i) != ' '){
                System.out.println(s.charAt(i) + " ");
            }
        }
    }
    // Time Complexity O(n^2)
    private static void NonRepeat(String st, int n){
          int freq[] = new int[200];  

        // Convert string to char array
        char s[] = st.toCharArray();  

        // Count frequency of each character
        for (int i = 0; i < n; i++) {
            
            // Initialize frequency for each character
            freq[i] = 1;  

            // Check for duplicates
            for (int j = i + 1; j < n; j++) {
                if (s[i] == s[j]) {
                    
                    // Increment frequency if characters match
                    freq[i]++;  

                    // Set s[j] to '-' to avoid printing visited character
                    s[j] = '-';  
                }
            }
        }

        // Print non-repeating characters
        for (int i = 0; i < n; ++i) {
            if (freq[i] == 1 && s[i] != ' ' && s[i] != '-') {
                
                // Output non-repeating character
                System.out.print(s[i] + " ");  
            }
        }
    }
    
    public static void main(String[] args) {
        String s = "google";
        int n = s.length();
        NonRepeat(s,n);
        Optimal(s,n);
    }
    
}
