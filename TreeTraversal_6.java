public class TreeTraversal_6 {
    Node Head;
    class Node{
        int data;
        Node left,right;
        Node(int value){
            data = value;
            left = right = null;
        }
    }
    public void postOrderTraversal(Node node){
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.data + " ");
    }
    public Node getAllPostOrderTree(int start, int end, int in[]){
        if(start > end)
            return null;
        Head = new Node(in[start]);
        Head.left = getAllPostOrderTree(start, start-1, in);
        Head.right = getAllPostOrderTree(start+1, end, in);
        return Head;
    }
}
