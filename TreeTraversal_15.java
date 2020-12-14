import java.util.*;
public class TreeTraversal_15 {
    Node head;
    class Node{
        int data;
        Node left,right;
        Node(int value){
            data  = value;
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
        head.left.left.right.left = new Node(16);
        head.left.right.right.left = new  Node(17);
        head.left.right.right.right = new Node(18);
        head.right.left.right.right = new Node(19);
    }
    public void twoLevelOrderTraversal(){
        int ct = 0;
        boolean rightToLeft = false;
        Queue<Node> q1 = new LinkedList<>();
        Stack<Node> s1 = new Stack<>();
        q1.add(head);

        while(!q1.isEmpty()){
            ct++;
            int size = q1.size();
            for(int  i = 0;i<size; i++){
                Node temp = q1.peek();
                q1.remove();
                if(rightToLeft == false)
                    System.out.print(temp.data + " ");
                else
                    s1.push(temp);
                if(temp.left != null)
                    q1.add(temp.left);
                if(temp.right != null)
                    q1.add(temp.right);
            }
            if(rightToLeft == true){
                while(!s1.isEmpty()){
                    System.out.print(s1.pop().data + " ");
                }
            }
            if(ct == 2){
                ct = 0;
                rightToLeft = !rightToLeft;
            }
            System.out.println();
        }
        while(!s1.isEmpty()){
            System.out.print(s1.pop().data + " ");
        }
    }
}
