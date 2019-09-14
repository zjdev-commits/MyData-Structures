/*
* 选择排序之堆排序
*O(NlogN)
* */
public class HeapSort {
    public void heapSort(int[] arr){
        for(int i= (arr.length-2)/2;i>=0;i--){
            adjustHead(arr,i,arr.length);
        }
        for(int i=arr.length-1;i>0;i--){
           swap(arr,0,i);
           adjustHead(arr,0,i);
        }
    }

    private void swap(int[] arr, int i, int i1) {
        int temp ;
        temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

    private void adjustHead(int[] arr,int i,int length) {
        int j;//孩子结点
        int temp = arr[i];//把根节点提取出来
        for(j = 2*i+1;j<length;j=j*2+1){//不断地从原根节点从它的左右孩子结点进行开始比较，挑出最大的结点往下走，
            //而把最大结点上浮，直至自己是子堆顶位置。
            if(j<length-1&&arr[j]<arr[j+1]){//这里的j<length-1一定不能忘，避免没有右孩子的情况,防止j+1溢出
                j++;
            }
            if(temp>=arr[j]){
                break;
            }
            arr[i] = arr[j];
            i = j;//更新原根节点的位置
        }
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] a = {8,4,6,3,1,12,10,18};
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
