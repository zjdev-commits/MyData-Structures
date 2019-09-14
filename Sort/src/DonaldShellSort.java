/*插入排序之
 * 希尔排序
 * N(NlogN~N^2)*/
public class DonaldShellSort {
    public void sort(int[] arr){
        int increment=arr.length;
        int j;
        int temp;
        do{
            increment =  increment/3+1;
            for(int i = increment;i<arr.length;i++){
               if(arr[i]<arr[i-increment]){
                   temp = arr[i];
                   for (j =i-increment;j>=0&&arr[j]>temp;j-=increment){
                       arr[j+increment] = arr[j];
                   }
                   arr[j+increment]=temp;
               }
            }

        }while (increment>1);
    }

    public static void main(String[] args) {
        int[] a = {8,2,2,4,6,3,1,0,12,10,18};
       DonaldShellSort donaldShellSort = new DonaldShellSort();
       donaldShellSort.sort(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
