import java.util.*;
public class TreeTraversal_13 {
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
        Head.left.left = new Node(7);
        Head.left.right = new Node(6);
        Head.right.left = new Node(5);
        Head.right.right = new Node(4);
    }
    public void getSpiralTraversal(){
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();
        s1.push(Head);
        while(!s1.empty() || !s2.empty()){
            while(!s1.empty()){
                Node temp = s1.pop();
                System.out.print(temp.data + " ");
                if(temp.right != null)
                    s2.push(temp.right);
                if(temp.left != null)
                    s2.push(temp.left);
            }
            while(!s2.empty()){
                Node temp = s2.pop();
                System.out.print(temp.data + " ");
                if(temp.left != null)
                    s1.push(temp.left);
                if(temp.right != null)
                    s1.push(temp.right);
            }
        }
    }
}
