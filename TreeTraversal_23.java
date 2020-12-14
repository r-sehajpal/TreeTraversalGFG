import java.util.*;
public class TreeTraversal_23 {
    Node head;
    class Node{
        int data;
        Node left,right;
        Node(int value){
            data  = value;
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
    public void iterativePostOrder(){
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();
        s1.push(head);
        while(!s1.isEmpty()){
            Node temp = s1.pop();
            s2.push(temp);
            if(temp.left != null)
                s1.push(temp.left);
            if(temp.right != null)
                s1.push(temp.right);
        }
        while(!s2.isEmpty()){
            System.out.print(s2.pop().data + " ");
        }
    }
}
