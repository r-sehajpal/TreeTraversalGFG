public class TreeTraversal_4 {
    int preIndex = 0;
    public void postOrderTraversal(int in[], int pre[], int start, int end){
        if(start > end)
            return;
        int indexFound = search(start, end, in, pre[preIndex++]);

        postOrderTraversal(in, pre, start, indexFound - 1);

        postOrderTraversal(in, pre, indexFound + 1, end);

        System.out.print(in[indexFound] + " ");
    }
    public int search(int start, int end, int in[], int element){
        for(int i = start; i <= end; i++){
            if(in[i] == element)
                return i;
        }
        return -1;
    }
}
