package Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLevelOrderTraversal {
    public List<List<Integer>> Level(Node root){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();

        if(root == null){
            return list;
        }
        queue.offer(root);

        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> sub = new LinkedList<>();
            for(int i = 0; i < level; i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                sub.add(queue.poll().data);
            }
            list.add(sub);
        }
      return list;
    }
    public static void main(String[] args) {
      Node node = new Node(1);
      node.left = new Node(2);
      node.right = new Node(3);
      node.left.left = new Node(4);
      node.left.right = new Node(5);
      node.right.left = new Node(6);
      node.right.right = new Node(7);

        TreeLevelOrderTraversal tree = new TreeLevelOrderTraversal();

        List<List<Integer>> ans = tree.Level(node);

        System.out.println("Level Order Traversal : ");
        System.out.print(ans);
    }
}
