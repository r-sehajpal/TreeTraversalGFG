import java.util.*;
public class TreeTraversal_24 {
    Node head;
    class Node{
        int data;
        Node left,right;
        Node(int value){
            data = value;
            left = right = null;
        }
    }
    public void insertElement(){
        head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
    }
    public void postOrderIterativeTraversal(){
        Stack<Node> s1 = new Stack<Node>();
        s1.push(head);
        Node root = head;
        while(!s1.isEmpty()) {

        }
    }
}
