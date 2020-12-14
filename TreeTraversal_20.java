import java.util.*;
public class TreeTraversal_20 {
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
        head.left.left.left = new Node(8);
        head.left.left.right = new Node(9);
        head.left.right.left = new Node(10);
        head.left.right.right = new Node(11);
        head.right.left.left = new Node(12);
        head.right.left.right = new Node(13);
        head.right.right.left = new Node(14);
        head.right.right.right = new Node(15);
    }
    public void alterNodes(Node node1, Node node2, int level){
        if(node1 == null || node2 == null)
            return;
        if(level % 2 == 0){
            int temp = node1.data;
            node1.data = node2.data;
            node2.data = temp;
        }

        alterNodes(node1.left, node2.right,level+1);

        alterNodes(node1.right, node2.left, level+1);
    }
    public void inorderTraversal(Node move){
        if(move == null)
            return;
        inorderTraversal(move.left);
        System.out.print(move.data + " ");
        inorderTraversal(move.right);
    }
    public void reverseAlternateNodes(){
        //alterNodes(head.left,head.right,0);
        getInorderNodes(head,0);
        updateNodeData(head,0);
        inorderTraversal(head);
    }
    //Another Approach
    Stack<Integer> s1 = new Stack<Integer>();
    void getInorderNodes(Node move,int level){
        if(move == null)
            return;
        getInorderNodes(move.left,level+1);
        if(level % 2 == 1)
            s1.push(move.data);
        getInorderNodes(move.right, level+1);
    }

    void updateNodeData(Node move, int level){
        if(move == null)
            return;
        updateNodeData(move.left, level+1);
        if(level % 2 == 1){
            move.data = s1.pop();
        }
        updateNodeData(move.right,level+1);
    }

}
