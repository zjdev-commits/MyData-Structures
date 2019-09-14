/*交换排序
* 之冒泡排序
* */
/*O(N^2)*/
public class BubbleSort {
    public void sort(int [] a){
        boolean flag=false;
        int temp;
        for(int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){/*length-1比较次数为长度-1，再去去以及排好序的i个数*/
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
                if(!flag){
                    break;
                }
            }
        }

    }


    public static void main(String[] args) {
        int[] a = {3,2,1};
        BubbleSort bs = new BubbleSort();
        bs.sort(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
