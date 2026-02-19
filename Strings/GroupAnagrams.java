package  Strings;
import java.util.*;

public class GroupAnagrams {
    private String getFreq(String s){
        
        int result[] = new int[26];
        for(int i = 0; i < s.length(); i++){
            result[s.charAt(i) - 'a']++;
        }
        StringBuilder str = new StringBuilder("");
        char c = 'a';
        for(int i :result){
            str.append(c);
            str.append(i);
            c++;
        }
        return str.toString();
    }
    public List<List<String>> groupAnagram(String words[]){
         if(words == null || words.length == 0){
            return null;
         }
         Map<String,List<String>> map = new HashMap<>();
         for( String str : words){
            String freq = getFreq(str);
            if(map.containsKey(freq)){
                map.get(freq).add(str);
            }else{
                List<String> li = new ArrayList<>();
                li.add(str);
                map.put(freq,li);
            }
         }
         return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String words[] = {"eat","ate","tea","listen","silent"};
        GroupAnagrams obj = new GroupAnagrams();
        List<List<String>> res = obj.groupAnagram(words);

        for(List<String >ans : res){
            System.out.print(ans);
        }
    }
    
}
