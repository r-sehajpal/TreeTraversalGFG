public class TreeTraversal_30 {
    int position = 0;
    public void calculateHeightOfTree(char[] preOrder){
        int height = getHeight(preOrder);
        System.out.println(height);
    }
    public int getHeight(char[] preOrder){
        if(preOrder[position] == 'l' || position >= preOrder.length)
            return 0;

        ++position;
        int left = getHeight(preOrder);
        ++position;
        int right = getHeight(preOrder);
        return (left > right ? left + 1 : right + 1);
    }
}
