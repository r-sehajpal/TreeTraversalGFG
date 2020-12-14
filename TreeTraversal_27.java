import java.util.*;
public class TreeTraversal_27 {
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
    Queue<Node> q1 = new LinkedList<Node>();
    HashMap<Integer, Vector<Integer>> diagonalValueList = new HashMap<>();
    public void fillDiagonalMatrix(){
        Node move = head;
        while(!q1.isEmpty() || move!= null){
            if(move == null){
                move = q1.remove();
            }
            System.out.print(move.data + " ");
            if(move.left != null)
                q1.add(move.left);
            move = move.right;
        }
    }
}
