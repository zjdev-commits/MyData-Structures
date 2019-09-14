/*选择排序之
* 简单选择排序
* O(N^2)*/
public class ChooseSort {
    public void chooseSort(int[] arr){
        int temp,index;
        for(int i = 0;i<arr.length;i++){
            index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[index]>arr[j]){
                   index = j;
                }
            }
            if(index!=i){
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }

    }
    public static void main(String[] args) {
        ChooseSort cs = new ChooseSort();
        int[] a = {8,2,2,4,6,3,1,0,12,10,18};
        cs.chooseSort(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
