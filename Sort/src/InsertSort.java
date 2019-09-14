/*插入排序之
* 直接插入排序
* O(logN)
* */
public class InsertSort {
    public void insertSort(int[] arr){
        int temp;
        int j;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                temp = arr[i];
                for(j=i-1;j>=0&&arr[j]>temp;j--){
                    arr[j+1] = arr[j];
                }
                arr[j+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {8,2,2,4,6,3,1,0,12,10,18};
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
