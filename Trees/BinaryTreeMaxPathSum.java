package Trees;

public class BinaryTreeMaxPathSum{
    // TimeComplexity O(n)
    // SpaceComplexity O(1)
    public static int MaxPathSum(TreeNode root){
         int maxVal[] = new int[1];
         maxVal[0] = Integer.MIN_VALUE;
         PathSum(root, maxVal);
         return maxVal[0];
    }
    public static int PathSum(TreeNode root,int[] maxVal){
       if(root == null){
        return 0;
       }
       int leftSubTreeSum = Math.max(0, PathSum(root.left, maxVal));
       int rightSubTreeSum = Math.max(0, PathSum(root.right, maxVal)) ;
       maxVal[0] = Math.max(maxVal[0], leftSubTreeSum + rightSubTreeSum + root.val);

       return Math.max(leftSubTreeSum, rightSubTreeSum) + root.val;
    }
    public static void main(String[] args){
         TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3);
         int ans = MaxPathSum(root);
         System.out.println("Maximum Sum of the Path is : " + ans);
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