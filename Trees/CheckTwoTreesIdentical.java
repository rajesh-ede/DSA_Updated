package Trees;

class CheckTwoTreesIdentical{
  public static boolean isIdentical(TreeNode a, TreeNode b){
       if(a == null || b == null){
        return (a == b);
       }
       return (a.val == b.val && isIdentical(a.left, b.left) && isIdentical(a.right,b.right));
  }
  public static void main(String args[]){
    TreeNode node = new TreeNode(1);
    node.left = new TreeNode(2);
    node.right = new TreeNode(3);

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(4);

    boolean result = isIdentical(node, root);
    if(result){
        System.out.println("Given Two Trees are Identical");
    }else{
        System.out.println("Given Two Trees are not Identical");
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