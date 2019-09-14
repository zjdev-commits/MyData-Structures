/*交换排序
* 之冒泡排序升级版
* 鸡尾酒排序*/
public class BubbleSort2 {
    public void sort(int[] a){
        int temp,left,rigth;
        left = 0;
        rigth=a.length-1;
        while(left<rigth){
            for(int i=left;i<rigth;i++){
                if(a[i]>a[i+1]){
                    temp =a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            --rigth;
            for(int i=rigth;i>left;i--){
                if(a[i]<a[i-1]){
                    temp =a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                }

            }
            ++left;
        }
    }

    public static void main(String[] args) {
        BubbleSort2 bs2 = new BubbleSort2();
        int[] a = {8,2,4,6,3,1,0,12,10,18};
        bs2.sort(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
