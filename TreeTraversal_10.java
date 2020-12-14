public class TreeTraversal_10 {
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
    public void getElement(){
        Node move = Head;
        findElementAtPosition(move,4);
    }
    static int counter = 1;
    public void findElementAtPosition(Node move, int key){
        if(move != null){
            findElementAtPosition(move.left,key);
            if(counter == key)
                System.out.println(move.data);
            counter++;
            findElementAtPosition(move.right,key);
        }
    }
}
