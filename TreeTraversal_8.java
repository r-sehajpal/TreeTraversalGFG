public class TreeTraversal_8 {
    Node Head,move;
    class Node{
        int data;
        Node left,right,next;
        Node(int value){
            data = value;
            left = right = next = null;
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
    public void displaySuccessorOfNodes(){
        move = Head;
        populateInorderSuccessor(move);
        move = Head;
        inorderSuccessorOFNodes(move);
    }
    public void inorderSuccessorOFNodes(Node node){
        if(node != null){
            inorderSuccessorOFNodes(node.left);
            if(node.next != null)
                System.out.println(node.data + " : " + node.next.data);
            inorderSuccessorOFNodes(node.right);
        }
    }
    static Node next = null;
    public void populateInorderSuccessor(Node node){
        if(node != null){
            populateInorderSuccessor(node.right);

            node.next = next;
            next = node;

            populateInorderSuccessor(node.left);
        }
    }
}