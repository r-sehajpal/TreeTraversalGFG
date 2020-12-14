import java.util.*;
public class TreeTraversal_18 {
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
        head.left.left.left = new Node(8);
        head.left.left.right = new Node(9);
        head.left.right.left = new Node(10);
        head.left.right.right = new Node(11);
        head.right.left.left = new Node(12);
        head.right.left.right = new Node(13);
        head.right.right.left = new Node(14);
        head.right.right.right = new Node(15);
    }
    public void levelOrderTraversal(){
        //boolean isLeftToRight = true;
        Queue<Node> queueLeft = new LinkedList<Node>();
        queueLeft.add(head.left);
        queueLeft.add(head.right);
        System.out.print(head.data + " ");
        while(!queueLeft.isEmpty()){
            Node tempLeft = queueLeft.remove();
            Node tempRight = queueLeft.remove();
            System.out.print(tempLeft.data + " " + tempRight.data + " ");
            if(tempLeft.left != null)
                queueLeft.add(tempLeft.left);
            if(tempRight.right != null)
                queueLeft.add(tempRight.right);
            if(tempLeft.right != null)
                queueLeft.add(tempLeft.right);
            if(tempRight.left != null)
                queueLeft.add(tempRight.left);
        }
    }
}
