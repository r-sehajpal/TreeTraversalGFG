import java.util.*;
public class TreeTraversal_19 {
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
        head.left.left.left = new Node(8);
        head.left.left.right = new Node(9);
        head.left.right.left = new Node(10);
        head.left.right.right = new Node(11);
        head.right.left.left = new Node(12);
        head.right.left.right = new Node(13);
        head.right.right.left = new Node(14);
        head.right.right.right = new Node(15);
    }
    public void treeTraversal(){
        Queue<Node> q1 = new LinkedList<Node>();
        Stack<Node> s1 = new Stack<Node>();
        q1.add(head.left);
        q1.add(head.right);
        s1.push(head);
        while(!q1.isEmpty()){
            Node node1 = q1.remove();
            Node node2 = q1.remove();
            s1.push(node2);
            s1.push(node1);
            if(node1.right != null)
                q1.add(node1.right);
            if(node2.left != null)
                q1.add(node2.left);
            if(node1.left != null)
                q1.add(node1.left);
            if(node2.right != null)
                q1.add(node2.right);
        }
        while(!s1.isEmpty()){
            System.out.print(s1.pop().data + " ");
        }
    }
}
