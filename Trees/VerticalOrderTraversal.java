package Trees;
import java.util.*;

public class VerticalOrderTraversal {

    //Time Complexity O(n log n)
    //Space Complexity O(n) + o(n)
    public static List<List<Integer>> Vertical(TreeNode root){
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple p = q.poll();
            TreeNode node = p.node;
            int x = p.row;
            int y = p.col;

            map.putIfAbsent(x,new TreeMap<>());
            map.get(x).putIfAbsent(y,new PriorityQueue<>());
            map.get(x).get(y).offer(node.data);

            if(node.left != null)
            q.offer(new Tuple(node.left, x-1,y+1));

            if(node.right != null){
                q.offer(new Tuple(node.right, x + 1, y+1));
            }

        }
        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> rw : map.values()){
            List<Integer> list = new ArrayList<>();
            for(PriorityQueue <Integer> p : rw.values()){
                while(!p.isEmpty()){
                    list.add(p.poll());
                }

            }
            ans.add(list);
        }
        return ans;

    }
    public static void main(String[] args){
          TreeNode root = new TreeNode(1);
          root.left = new TreeNode(2);
          root.right = new TreeNode(3);
          root.left.left = new TreeNode(4);
          root.left.right = new TreeNode(5);

          List<List<Integer>> ans = Vertical(root);
           System.out.println("The Vertical Traversal of given Tree is : ");
          for(List<Integer> list : ans){
            System.out.print(list + " ");
          }
    }
}
class Tuple {
    TreeNode node;
    int row,col;
    Tuple(TreeNode node,int row,int col){
        this.node = node;
        this.row = row;
        this.col = col;
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