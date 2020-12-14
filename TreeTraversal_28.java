import java.util.*;
public class TreeTraversal_28 {
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
        head.left.right.left = new Node(6);
        head.left.right.right = new Node(7);
        head.right.right = new Node(8);
    }
    public void boundaryValueIteration(){

        //Print left boundary of Binary Tree
        Node move = head;
        while(move != null){
            if(move.left != null)
                System.out.print(move.data + " ");
            move = move.left;
        }

        //Print bottom boundary of Binary Tree
        printBottomBoundary(head);

        //Print right boundary of Binary Tree
        printRightBoundary(head);
    }
    public void printBottomBoundary(Node move){
        if(move == null)
            return;
        if(move.left == null && move.right == null)
            System.out.print(move.data + " ");
        printBottomBoundary(move.left);
        printBottomBoundary(move.right);
    }
    public void printRightBoundary(Node move){
        if(move == null)
            return;
        printRightBoundary(move.right);
        if(move != head && move.right!= null)
            System.out.print(move.data + " ");
    }
}
