import java.util.*;
public class TreeTraversal_14 {
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
    public void printLevelOrderByLine(){
        Queue<Node> l1 = new LinkedList<Node>();
        Queue<Node> l2 = new LinkedList<Node>();
        l1.add(Head);
        while(l1.size() > 0 || l2.size() > 0){

            while(l1.size() > 0){
                Node temp = l1.poll();
                System.out.print(temp.data + " ");
                if(temp.left != null)
                    l2.add(temp.left);
                if(temp.right != null)
                    l2.add(temp.right);
            }
            System.out.println();
            while(l2.size() > 0){
                Node temp = l2.poll();
                System.out.print(temp.data + " ");
                if(temp.left != null)
                    l1.add(temp.left);
                if(temp.right != null)
                    l1.add(temp.right);
            }
            System.out.println();
        }

    }
}
