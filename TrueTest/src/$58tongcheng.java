import java.util.HashSet;
import java.util.Scanner;

public class $58tongcheng {
    /*public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                HashSet hashSet = new HashSet();
                String[] s = in.nextLine().split(",");
                if(s!=null) {
                    for (String temp : s) {
                        hashSet.add(Integer.parseInt(temp));
                    }
                    System.out.println(hashSet.size());
                }
    }*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = Integer.parseInt(in.nextLine());
        int[] arr = new int[size];
        int[] arr2 = new int[size];
        int i=0;
        String s =null;
      while(!(s = in.nextLine()).equals("")){
          arr[i] =  Integer.parseInt(s);
          arr2[i] = 1;
          i++;
      }
        int j;
       for(j=1;j<arr.length-1;j++){
           if(j==1&&arr[j]<arr[j-1]){
               arr2[j-1]++;
           } else if(arr[j]>arr[j-1]||arr[j]>arr[j+1]){
               arr2[j]++;
           }
       }
       if(arr[arr.length-1]>arr[j]){
            arr2[arr.length-1]++;
       }
       int count = 0;
       for (int temp:arr2){
           count +=temp;
       }
        System.out.println(count);

    }
}
