import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ￥350IntersectionOfTwoArraysIi {
    public int[] intersect(int[] nums1,int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums1){
            if(map.containsKey(num)){
            map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num:nums2){
            if(map.containsKey(num)){
                list.add(num);
                map.put(num,map.get(num)-1);
                if(map.get(num)==0){
                    map.remove(num);
                }
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
