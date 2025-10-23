package Stack;
import java.util.*;
public class StUsingArray {
    public static void main(String[] args) {
       ArrayList<Integer> ans = new ArrayList<>();
       ans.add(20);
       ans.add(40);
       ans.add(70);
       ans.add(50);
       ans.add(56);
       ans.add(64);
       System.out.println(ans.get(ans.size()-1)); // It return last Element of array
       ans.remove(ans.size()-1);// It remove Last Element
       System.out.println(ans);// update the Array After modification

        while(!ans.isEmpty()){
            System.out.println(ans.get(ans.size()-1));
            ans.remove(ans.size()-1);
        }

    }

}

//Time Complexity:
//push: O(1)
//pop: O(1)
//peek: O(1)
//is_empty: O(1)
//is_full: O(1)
//Auxiliary Space: O(n), where n is the number of items in the stack.

/*
class MyStack {
    private int arr[];
    private int top;
    private static final int max = 100;
    MyStack(){
        arr = new int[max];
        top = -1;
    }
    public void push(int x) {
        // code here
        if(top >= max-1) return;
        top++;
        arr[top] = x;
    }

    public int pop() {

        // code here
        if(top == -1){
            return -1;
        }
        return arr[top--];
    }
}

 */