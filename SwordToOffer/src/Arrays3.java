/*
* 题目描述
在一个二维数组中（每个一维数组的长度相同），
每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数*/
public class Arrays3 {
    /*
    O（N^2）
    public boolean Find(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }*/
    /*
    * 0(N)
    * */
    public boolean Find(int target, int [][] array) {
        int row=0;
        int col=array[0].length-1;
        while(row<=array.length-1&&col>=0){
            if(target==array[row][col])
                return true;
            else if(target>array[row][col])
                row++;
            else
                col--;
        }
        return false;

    }


    public static void main(String[] args) {
        int[][] arr = {{4,7,10,13},{6,8,11,15}};
        Arrays3 arrays3 = new Arrays3();
        System.out.println(arrays3.Find(7,arr));
    }
}
