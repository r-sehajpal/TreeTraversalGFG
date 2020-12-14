import java.util.*;
public class TreeTraversal_2 {
    Node Head;
    class Node{
        int data;
        Node left,right;
        Node(int value){
            data  = value;
            left = right = null;
        }
    }
    public void insertNode(){
        Head = new Node(1);
        Head.left = new Node(2);
        Head.right = new Node(3);
        Head.left.left = new Node(4);
        Head.left.right = new Node(5);
        Head.right.left = new Node(6);
        Head.right.right = new Node(7);
    }
    public void displayInOrderTraversal(){
        Stack<Node> s1 = new Stack<Node>();
        Node current = Head;
        while(!s1.empty() || current != null){
            while(current != null){
                s1.push(current);
                current = current.left;
            }
            Node temp = s1.pop();
            System.out.print(temp.data + " ");
            current = temp.right;
        }
    }
}
