package Trees;
import java.util.*;

class LeftViewOfBinaryTree{
    public static List<Integer>LeftViewByBFS(TreeNode root){
     List<Integer>list = new ArrayList<>();
     Queue<TreeNode>queue = new LinkedList<>();
     queue.offer(root);
     while(!queue.isEmpty()){
        int size = queue.size();
        for(int i = 0; i < size; i++){
            TreeNode node = queue.poll();
            if(i == 0){
                list.add(node.data);
            }
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }
     }
     return list;
    }
    public static List<Integer>LeftViewByDFS(TreeNode root){
      List<Integer> res = new ArrayList<>();
        dfsLeft(root,res,0);
        return res;
    }
    public static void dfsLeft(TreeNode root,List<Integer> ans,int depth){
        if(root == null){
            return;
        }
        if(depth == ans.size()){
            ans.add(root.data);
        }
        dfsLeft(root.left,ans,depth+1);
        dfsLeft(root.right,ans,depth+1);
    }
    public static void main(String[] args){
       TreeNode root = new TreeNode(1);
          root.left = new TreeNode(2);
          root.right = new TreeNode(3);
          root.left.left = new TreeNode(4);
          root.left.right = new TreeNode(5);
          List<Integer> ans  = LeftViewByBFS(root);
          System.out.println("Left View By BFS Traversal :");
          for(int ele : ans){
            System.out.print(ele +" ");
          }
          System.out.println("\n");
          List<Integer> res = LeftViewByDFS(root);
          System.out.println("Left View By DFS Traversal :");
          for(int e : res){
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