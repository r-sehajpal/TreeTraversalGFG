public class TreeTraversal_29 {
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
        head.left.left.left = new Node(5);
        head.left.left.left.left = new Node(6);
        head.left.right = new Node(7);
    }
    int maxHeight = 0;
    int size = 0;
    public void calculateHeight(Node move, int height){
        if(move == null)
            return;
        calculateHeight(move.left, height + 1);
        maxHeight = height > maxHeight ? height : maxHeight;
        calculateHeight(move.right, height + 1);
        maxHeight = height > maxHeight ? height : maxHeight;
        size++;
    }
    public void getHeightOfTree(){
        calculateHeight(head,1);
        //float density = (float)size/maxHeight;
        System.out.println((float)size/maxHeight);
    }
}
