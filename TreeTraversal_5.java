public class TreeTraversal_5 {
    public void getPostOrderBST(int pre[]){
        int pivotPoint = 0;
        for(int i = 1;i < pre.length; i++){
            if(pre[0] <= pre[i]){
                pivotPoint = i;
                break;
            }
        }
        for(int i = pivotPoint-1; i>0; i--){
            System.out.print(pre[i] + " ");
        }
        for(int i = pre.length-1; i>=pivotPoint; i--){
            System.out.print(pre[i] + " ");
        }
        System.out.print(pre[0]);
    }
}
