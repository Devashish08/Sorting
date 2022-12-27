
import java.util.*;

public class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
    static void printTree(Node root){
        // ?base case
        if(root == null){
            return;
        }
        // my task
        System.out.println(root.data);
        // recAns
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String[] args) {
        Node one = new Node(1);
        one.left = new Node(2);
        one.right = new Node(3);
        one.left.left = new Node(4);
        one.left.right = new Node(5);

 System.out.println(printTree(one););
    }
}
