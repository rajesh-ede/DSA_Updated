
package Arrays.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class Subset {

     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      
      for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
      }
      int m = sc.nextInt();
      
      int b[] = new int[m];
      for(int i = 0; i < m; i++){
        b[i] = sc.nextInt();
      }
      
      boolean result = isSubset(a,b);
      
      System.out.println(result);
    }
    private static boolean isSubset(int a[], int b[]){
      
      HashMap<Integer,Integer> map = new HashMap<>();
      
      for(int num : a){
        map.put(num, map.getOrDefault(num,0)+1);
      }
      for(int num : b){
        if(!map.containsKey(num)|| map.get(num) == 0){
          return false;
        }
        map.put(num,map.get(num)-1);
      }
      
      return true;
    }
}