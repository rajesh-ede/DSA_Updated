package Graphs;

public class BST {

    public static class Node{
        int value;
        Node left;
        Node right;
        int height;

        Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(this.root, "Root Node is : ");
    }
    public void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());

        display(node.left, details + "\t");

        display(node.left,"Left child of " + node.getValue() +" : " );
        display(node.right,"Right child of " + node.getValue() + " : ");
    }
    private Node insert(int value,Node node){
        if(node == null){
           node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }
        if(value > node.value){
            node.right = insert(value,node.right);
        }

        node.height = Math.max(height((node.left)) , height(node.right));

        return node;
    }
    private boolean balenced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balenced(node.left) && balenced(node.right);
    }


}
