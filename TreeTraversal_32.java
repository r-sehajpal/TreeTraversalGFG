public class TreeTraversal_32 {
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
        head = new Node(10);
        head.left = new Node(8);
        head.right = new Node(2);
        head.left.left = new Node(3);
        head.left.right = new Node(5);
    }
    public void modifyTreeToGetPreOrder(){
        modifyTree(head);
        preOrderTraversalOfTree(head);
    }
    public void modifyTree(Node move){
        if(move.left == null && move.right == null)
            return;
        modifyTree(move.left);
        Node leftLeaf = move.left;
        modifyTree(move.right);
        Node rightLeaf = move.right;

        if(leftLeaf != null){
            Node rightMost = leftLeaf;
            while(rightMost.right != null){
                rightMost = rightMost.right;
            }
            rightMost.right = rightLeaf;
            move.right = leftLeaf;
            move.left = null;
        }
    }
    public void preOrderTraversalOfTree(Node move){
        while(move != null){
            System.out.print(move.data + " ");
            move = move.right;
        }
    }
}
