import java.util.*;
public class TreeTraversal_16 {
    Node head;
    class Node{
        int data;
        Node left,right;
        Node(int value){
            data = value;
            left = right = null;
        }
    }
    public void insertNode(){
        head = new Node(1);
        head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        head.right.left = new Node(6);
        head.right.right = new Node(7);
    }
    public void reverseLevelOrderTraversal(){
        Queue<Node> q1 = new LinkedList<>();
        Stack<Node> s1 = new Stack<>();
        q1.add(head);
        while(!q1.isEmpty()){
            Node temp = q1.remove();
            s1.push(temp);
            if(temp.right != null)
                q1.add(temp.right);
            if(temp.left != null)
                q1.add(temp.left);
        }
        while(!s1.isEmpty()){
            System.out.print(s1.pop().data + " ");
        }
    }
}
