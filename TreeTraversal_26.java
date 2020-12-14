import java.util.*;
import java.util.Map.*;
public class TreeTraversal_26 {
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
        head.right.left = new Node(5);
        head.right.right = new Node(6);
        head.right.right.left = new Node(9);
        head.right.left.left = new Node(7);
        head.right.left.right = new Node(8);
    }
    HashMap<Integer, Vector<Integer>> diagonalValueList = new HashMap<>();
    public void fillMap(){
        fillMapDiagonally(head,0);
        for (Entry<Integer, Vector<Integer>> entry :
                diagonalValueList.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }
    public void fillMapDiagonally(Node node, int diagonalValue){
        if(node == null)
            return;
        Vector<Integer> diagonalElement = diagonalValueList.get(diagonalValue);
        if(diagonalElement == null){
            diagonalElement = new Vector<>();
            diagonalElement.add(node.data);
        }
        else
            diagonalElement.add(node.data);
        diagonalValueList.put(diagonalValue,diagonalElement);
        fillMapDiagonally(node.left, diagonalValue + 1);
        fillMapDiagonally(node.right, diagonalValue);
    }
}
