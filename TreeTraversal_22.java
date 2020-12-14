import java.util.*;
public class TreeTraversal_22 {
    Node head;
    class Node{
        int data;
        Node left,right;
        Node(int value){
            data = value;
            left  = right = null;
        }
    }
    public void insertElement(){
        head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
    }
    public void iterativePreOrder(){
        Stack<Node> s1 = new Stack<Node>();
        s1.push(head);
        while(!s1.isEmpty()){
            Node temp = s1.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null)
                s1.push(temp.right);
            if(temp.left != null)
                s1.push(temp.left);
        }
    }
}
