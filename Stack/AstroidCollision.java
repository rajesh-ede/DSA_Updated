package Stack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AstroidCollision {
    public static int[] Astroid(int[] arr){
       List<Integer> li = new ArrayList<>();
        for(int a : arr){
            li.add(a);
        }
        boolean change = true;
        while(change) {
            change = false;
            for (int i = 0; i < li.size() - 1; i++) {
                int left = li.get(i);
                int right = li.get(i + 1);
                if (left > 0 && right < 0) {
                    if (Math.abs(left) == Math.abs(right)) {
                        li.remove(i + 1);
                        li.remove(i);

                    } else if (Math.abs(left) > Math.abs(right)) {
                        li.remove(i + 1);
                    } else {
                        li.remove(i);
                    }
                    change = true;
                    break;
                }
            }
        }
        int result[] = new int[li.size()];
        for(int i = 0; i < li.size(); i++){
            result[i] = li.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr = {5,10,-5};
        int []result = Astroid(arr);
        System.out.println(Arrays.toString(result));
    }
}
