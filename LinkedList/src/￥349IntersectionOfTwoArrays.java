/*给定两个数组，编写一个函数来计算它们的交集。

        示例 1:

        输入: nums1 = [1,2,2,1], nums2 = [2,2]
        输出: [2]
        示例 2:

        输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        输出: [9,4]
        说明:

        输出结果中的每个元素一定是唯一的。
        我们可以不考虑输出结果的顺序。*/


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class ￥349IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet set = new HashSet<Integer>();
        for(int num:nums1){
            set.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num:nums2){
            if(set.contains(num)) {
                list.add(num);
                set.remove(num);
            }
        }
        int [] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
