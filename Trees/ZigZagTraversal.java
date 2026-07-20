package Trees;
import java.util.*;
class ZigZagTraversal {
    public static void main (String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> ans = ZigZag(root);

        for(List<Integer> res : ans){
            System.out.println(res + " ");
        }
    }
    public static List<List<Integer>>ZigZag(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftToright = true;
        while(!q.isEmpty()){
            int size = q.size();
            Integer[] level = new Integer[size];
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                int idx = leftToright ? i : size - 1- i;
                level[idx] = curr.data;
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            leftToright = !leftToright;
            ans.add(Arrays.asList(level));
        }
        return ans;
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