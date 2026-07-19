package Trees;

public class DiameterOfTree {
    // Optimal Solution for Calculating the Diamter 
    // Time Complexity : O(n);
    //Space Complexity : O(1);
    public static int Diameter(TreeNode root){
       int[] diameter = new int[1];
       getDiameter(root, diameter);
       return diameter[0];
    }
    public static int getDiameter(TreeNode root, int[] diameter){
      if(root == null){
        return 0;
      }
      int leftHeight = getDiameter(root.left,diameter);
      int rightHeight = getDiameter(root.right, diameter);

      diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);

      return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main (String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);

        int dia = Diameter(root);
        System.out.println("Diameter of the given Tree is :" + dia);
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