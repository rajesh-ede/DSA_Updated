package Trees;
import java.util.*;

public class CheckSymmetricBinaryTree{
    public static boolean isSymmetricByBFS(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty()){
            TreeNode l = queue.poll();
            TreeNode r = queue.poll();

            if(l == null && r == null){
                return  true;
            }
            if(l == null || r == null){
                return false;
            }
            if(l.data != r.data){
                return false;
            }
            queue.offer(l.left);
            queue.offer(r.right);

            queue.offer(l.right);
            queue.offer(r.left);
        }
        return true;
    }
    public static boolean isSymmetricByDFS(TreeNode root){
       if(root == null){
        return true;
       }
       return dfs(root.left,root.right);
    }
    public static boolean dfs(TreeNode l,TreeNode r){
       
       if(l == null && r == null)
       return true;
       if(l == null || r == null)
       return false;

       if(l.data != r.data){
        return false;
       }

       return dfs(l.left,r.right) && dfs(l.right , r.left);
    }
    public static void main(String[] args){
     TreeNode root = new TreeNode(1);
     root.left = new TreeNode(2);
     root.right = new TreeNode(2);
     root.left.left = new TreeNode(3);
     root.left.right = new TreeNode(4);
     root.right.left = new TreeNode(4);
     root.right.right = new TreeNode(3);

     boolean issym = isSymmetricByDFS(root);
     if(issym){
        System.out.println("Given Tree are Symmetric");
     }else{
        System.out.println("Given trees are Not Symmetric");
     }
     System.out.println("\n");
     boolean issymbfs = isSymmetricByBFS(root);
     if(issymbfs){
        System.out.println("Given Tree having Mirror");
     }else{
        System.out.println("Given Tree do not having Mirror");
     }
    }
}
class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data = data;
    }
    TreeNode(int data,TreeNode left,TreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}