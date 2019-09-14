import java.util.ArrayList;

public class ￥350Intersection_Of_Two_Arrays_Ii {
        public int[] intersect(int[] nums1,int[] nums2) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int num:nums1){
                list.add(num);
            }
            ArrayList<Integer> list2 = new ArrayList<>();

            for (Integer num:nums2){
                if(list.contains(num)) {
                    list2.add(num);
                    list.remove(num);
                }
            }
            int [] arr = new int[list2.size()];
            for(int i=0;i<arr.length;i++){
                arr[i]=list2.get(i);
            }
            return arr;
        }

}
