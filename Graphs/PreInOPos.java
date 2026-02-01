package Graphs;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class PreInOPos {
    public List<List<Integer>> PreInPost(Node root){
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> Pre = new ArrayList<>();
        List<Integer> In = new ArrayList<>();
        List<Integer> Pos = new ArrayList<>();
        Stack<Pair<Node,Integer>> st = new Stack<>();

        st.push(new Pair<>(root,1));

        while(!st.isEmpty()){
            Pair<Node,Integer> it = st.pop();

            if(it.getValue() == 1){
                Pre.add(it.getKey().data);
                it.setValue(2);
                st.push(it);

                if(it.getKey().left != null){
                    st.push(new Pair<>(it.getKey().left,1));
                }
            } else if (it.getValue() == 2) {
                In.add(it.getKey().data);
                it.setValue(3);
                st.push(it);

                if(it.getKey().right != null){
                    st.push(new Pair<>(it.getKey().right,1));
                }
            }else{
                Pos.add(it.getKey().data);
            }

        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(Pre);
        result.add(In);
        result.add(Pos);

        return result;
    }
    public  void PrintList(List<Integer> list){
       for(int num : list){
           System.out.print(num + " ");
       }
       System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // Create object of Solution class
        PreInOPos sol = new PreInOPos(); // Getting the pre-order, in-order, // and post-order traversals
         List<List<Integer>> traversals = sol.PreInPost(root); // Extracting the traversals
         List<Integer> pre = traversals.get(0);
         List<Integer> in = traversals.get(1);
         List<Integer> post = traversals.get(2); // Printing the traversals
         System.out.print("Preorder traversal: ");
         sol.PrintList(pre);
         System.out.print("Inorder traversal: ");
         sol.PrintList(in);
         System.out.print("Postorder traversal: ");
         sol.PrintList(post);
    }
}
