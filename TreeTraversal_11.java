public class TreeTraversal_11 {
    Node Head;
    class Node{
        int data;
        Node left,right;
        Node(int value){
            data = value;
            left = right = null;
        }
    }
    public void getNthPostOrderNode(){
        getNode(Head,4);
    }
    static int count = 1;
    public void getNode(Node move, int key){
        if(move != null){
            getNode(move.left, key);
            getNode(move.right, key);
            if(count == key)
                System.out.println(move.data);
            count++;
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
}
