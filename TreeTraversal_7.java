import java.util.*;
public class TreeTraversal_7 {
    Vector<Integer> in = new Vector<Integer>();
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
    public void getInOrderTraversal(Node move){
        if(move == null)
            return;
        getInOrderTraversal(move.left);
        in.add(move.data);
        getInOrderTraversal(move.right);
    }
    int index = 0;
    public void modifyTree(){
        getInOrderTraversal(Head);
        getSumOfSuccessorAndPredecessor(Head,in,index);
        getNewInorderTraversal(Head);
    }
    public void getNewInorderTraversal(Node move){
        if(move == null)
            return;
        getNewInorderTraversal(move.left);
        System.out.println(move.data + " ");
        getNewInorderTraversal(move.right);
    }
    public void getSumOfSuccessorAndPredecessor(Node move,Vector<Integer> in, int index){
        if(move == null)
            return;
        getSumOfSuccessorAndPredecessor(move.left,in,index);
        move.data = (index-1 < 0 ? 0:in.get(index-1)) + (index+1 > in.size()-1 ? 0 : in.get(index+1));
        index++;
        getSumOfSuccessorAndPredecessor(move.right,in,index);
    }
}
