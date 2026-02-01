package Graphs;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public static void helper(Node node, List<Integer> ans){
        if(node == null){
            return;
        }
        helper(node.left, ans);
        ans.add(node.data);
        helper(node.right, ans);

    }
    public List<Integer> Inorder(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        helper(root, res);

        return res;
    }
    public static void main(String[] args) {
      Node root = new Node(1);
        root.left = new Node(2);
      root.right = new Node(3);
       root.left.left = new Node(4);
      root.left.right = new Node(5);

        InOrderTraversal in = new InOrderTraversal();

        List<Integer> ans = in.Inorder(root);
        System.out.println("InOrdertravse :"+  ans);
    }

}
 class Node{
   int data;
   Node left;
   Node right;

   Node(int data){
       this.data = data;
   }
   
}