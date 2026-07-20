
package Trees;
import java.util.*;

class MaximumDepth{
    // Calculating height based on the BFS depth
    // Time Complexity : O(n)
    // Space Complexity : O(H)
public static int BFSDepth(TreeNode root){
    if(root == null){
        return 0;
    }
   Queue<TreeNode> q = new LinkedList<>();
   q.offer(root);
   int depth = 0;
   while(!q.isEmpty()){
    int size = q.size();
    for(int i = 0; i < size; i++){
        TreeNode curr = q.poll();
        if(curr.left != null){
            q.offer(curr.left);
        }
        if(curr.right != null){
            q.offer(curr.right);
        }
    }
    depth++;
   }
   return depth;
}
    // calculating Height based on the DFS height
    public static int Depth(TreeNode root){

        if(root == null){
            return 0;
        }
        int leftHeight = Depth(root.left);
        int rightHeight = Depth(root.right);

        return Math.max(leftHeight , rightHeight) + 1;
    }
   public static void main(String args[]){
           TreeNode root = new TreeNode(1);
           root.left = new TreeNode(2);
           root.right = new TreeNode(3);
           root.left.left = new TreeNode(4);
           root.left.right = new TreeNode(5);
           root.left.left.left = new TreeNode(6);
           root.left.left.left.left = new TreeNode(7);
           int height = Depth(root);
           System.out.println("The Maximum Depth od given Binary Tree is  :"+height);
           int bfs = BFSDepth(root);
           System.out.println("The Maximum Depth of given Tree By BFS :" + bfs);
   }
}
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data = data;
    }
    TreeNode(int data,TreeNode left, TreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}