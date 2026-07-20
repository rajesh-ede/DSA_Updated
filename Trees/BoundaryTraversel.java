package Trees;
import java.util.*;

public class BoundaryTraversel {
    public static boolean isLeaf(TreeNode node){
        return (node.left == null && node.right == null);
    }
    public static List<Integer>Bound(TreeNode root){
       List<Integer> ans = new ArrayList<>();
       if(root ==  null){
        return ans;
       }
       if(!isLeaf(root)){
        ans.add(root.val);
       }
       handleLeftBoundary(root, ans);
       addLeafNode(root, ans);
       handlerightBoundary(root,ans);
       return ans;
    }
    public static void handleLeftBoundary(TreeNode node, List<Integer> ans){
       
        TreeNode curr = node.left;
        while(curr != null){
            if(!isLeaf(curr)){
                ans.add(curr.val);
            } 
            if(curr.left != null){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }
    }
    public static void addLeafNode(TreeNode node, List<Integer> ans){
        
        if(node == null){
            return;
        }
        if(isLeaf(node)){
            ans.add(node.val);
            return;
        }
        addLeafNode(node.left,ans);
        addLeafNode(node.right,ans);
    }
    public static void handlerightBoundary(TreeNode node,List<Integer> ans){
        TreeNode curr = node.right;
        Stack<Integer> st = new Stack<>();
        while(curr != null){
            if(!isLeaf(curr)){
                st.push(curr.val);
            }
            if(curr.right != null){
                curr = curr.right;
            }else{
                curr = curr.left;
            }

        }
        while(!st.isEmpty()){
           ans.add(st.pop());
        }
    }

    public static void main (String[] args){
        TreeNode node = new TreeNode(1);
      node.left = new TreeNode(2);
      node.right = new TreeNode(3);
      node.left.left = new TreeNode(4);
      node.left.right = new TreeNode(5);
      node.right.left = new TreeNode(6);
      node.right.right = new TreeNode(7);
      node.left.right.left = new TreeNode(8);
      node.left.right.right = new TreeNode(9);

      List<Integer> res = Bound(node);
      System.out.println("Boundary traversal : ");
      for(int ans : res){
        System.out.print(ans + " ");
      }
    }

}
class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

