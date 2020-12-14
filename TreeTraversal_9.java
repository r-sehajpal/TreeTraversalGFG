public class TreeTraversal_9 {
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
    public void findInOrderSuccessorOFNode(){
        Node move = Head;
        getInOrderSuccessor(move,1);
    }
    static int next;
    public void getInOrderSuccessor(Node move, int key){
        if(move != null){
            getInOrderSuccessor(move.right,key);
            if(move.data == key)
                System.out.println("Inorder successor of "+move.data+" is: " + next);
            next = move.data;
            getInOrderSuccessor(move.left,key);
        }
    }
}
