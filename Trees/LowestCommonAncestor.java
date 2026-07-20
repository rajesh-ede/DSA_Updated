package Trees;

import java.util.*;

public class LowestCommonAncestor{
    public static void main(String[] args){

    TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode lca = LCABrute(root, p, q);

        TreeNode lcaa = LCAOptimal(root,p,q);

        System.out.println("The LCA is through bruteforce : " + lca.data);
        System.out.println("\n\n");
        System.out.println("The LCA is through OptimalDFS : " +lcaa.data);



    }
    public static TreeNode LCABrute(TreeNode root, TreeNode p,TreeNode q){

        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();

        findPath(root,path1,p);
        findPath(root,path2,q);

        TreeNode lca = null;
        int i = 0;

        while(i < path1.size() && i < path2.size()){
            if(path1.get(i) == path2.get(i)){
                lca = path1.get(i);
            }else{
                break;
            }
            i++;
        }
        return lca;
    }
    public static boolean findPath(TreeNode root, List<TreeNode>path, TreeNode target){
        if(root == null){
            return false;
        }
        path.add(root);

        if(root == target){
            return true;
        }
        if(findPath(root.left,path,target)||
        findPath(root.right,path,target)){
         return true;
        }

        path.remove(path.size()-1);
      return false;

    }
    public static TreeNode LCAOptimal(TreeNode root, TreeNode p, TreeNode q){

        if(root == null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        TreeNode left = LCAOptimal(root.left,p,q);
        TreeNode right = LCAOptimal(root.right,p,q);

        if(left == null){
            return right;
        }
        if(right == null){
            return null;
        }
        return root;
        
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