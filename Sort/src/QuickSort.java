/*
* 0(NlogN)
* */
public class QuickSort {
    public void quickSort(int[] arr){
        int low = 0,high = arr.length-1;
       quickSort(arr,low,high);
    }
    private void quickSort(int[] arr,int low,int high){
        int medium;
        if(low<high) {
            medium = partition(arr, low, high);
            //递归曲轴左侧
            quickSort(arr, low, medium - 1);
            // 递归曲轴右侧
            quickSort(arr, medium + 1, high);
        }
    }

    private int partition(int[] arr,int low,int high) {
        //选择一个元素作为曲轴，使曲轴左侧都比曲轴小， 使曲轴右侧都比曲轴小
        int temp = arr[low];
        while(low<high){
            while(low<high&&arr[high]>=temp){
                high--;
            }
            swap(arr,low,high);
            while(low<high&&temp<=arr[high]){
                low++;
            }
            swap(arr,low,high);
        }
        //最后返回曲轴坐标
        int medium = low;
        return medium;
    }

    private void swap(int[] arr,int low,int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
    public static void main(String[] args) {
        int[] a = {8,2,2,4,6,3,1,0,12,10,18};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(a);
        for(int i:a){
            System.out.println(i);
        }
    }

}
