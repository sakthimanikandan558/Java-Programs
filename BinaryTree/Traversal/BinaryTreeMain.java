package myprograms;
class Node{
    int val;
    Node left;
    Node right;
    public Node(int val) {
        this.val = val;
    }
}
public class BinaryTreeMain {
    public static void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.val+"->");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val+"->");
        inOrder(node.right);
    }
    public static void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+"->");
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.println();
        System.out.print("InOrder:");
        inOrder(root);
        System.out.println();
        System.out.print("PostOrder:");
        postOrder(root);
    }
}
