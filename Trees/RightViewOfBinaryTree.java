package Trees;

import java.util.*;
public class RightViewOfBinaryTree{
    public static List<Integer> RightViewByDFS(TreeNode root){
     List<Integer> list = new ArrayList<>();
     dfs(root,list,0);
     return list;
    }
    public static void dfs(TreeNode root,List<Integer> ans,int depth){
        if(root == null){
            return;
        }
         if(depth == ans.size()){
            ans.add(root.data);
         }
        dfs(root.right,ans,depth+1);
        dfs(root.left,ans,depth+1);
    }
    public static List<Integer> RightViewByBFS(TreeNode root){
       List<Integer> ans = new ArrayList<>();
       Queue<TreeNode> q = new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty()){
        int size = q.size();
        for(int i = 0; i < size; i++){
            TreeNode node = q.poll();
            if(i == size - 1){
                ans.add(node.data);
            }
            if(node.left != null){
                q.offer(node.left);
            }
            if(node.right != null){
                q.offer(node.right);
            }
        }

       }
       return ans;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
          root.left = new TreeNode(2);
          root.right = new TreeNode(3);
          root.left.left = new TreeNode(4);
          root.left.right = new TreeNode(5);

          List<Integer> ans = RightViewByBFS(root);
          System.out.println("This is Right view By BFS : ");
          for(int res : ans){
            System.out.print(res + " ");
          }
          System.out.println('\n');
          List<Integer> ele = RightViewByDFS(root);
          System.out.println("This is Right view By DFS:");
          for(int e : ele){
            System.out.print(e + " ");
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