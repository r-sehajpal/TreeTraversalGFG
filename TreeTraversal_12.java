import java.util.*;
public class TreeTraversal_12 {
    Node Head;
    class Node{
        int data;
        Node left,right;
        Node(int value){
            data = value;
            left = right = null;
        }
    }
    public void insertElement(){
        Head = new Node(1);
        Head.left = new Node(2);
        Head.right = new Node(3);
        Head.left.left = new Node(4);
        Head.left.right = new Node(5);
        Head.right.left = new Node(6);
        Head.right.right = new Node(7);
    }
    public void getLevelOrderTraversal(){
        Queue<Node> q1 = new LinkedList<Node>();
        q1.add(Head);
        while(q1.size() != 0){
            Node temp = q1.remove();
            System.out.print(temp.data + " ");
            if(temp.left != null)
                q1.add(temp.left);
            if(temp.right != null)
                q1.add(temp.right);
        }
    }
}
