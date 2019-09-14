public class RecursionSum {
    /*
    * 递归对arr[]里的元素求和
    * Sum(a[0,...n-1])=a[0]+Sum(a[1,..n-1]);
    * Sum(a[1,..n-1]) = a[1]+Sum(a[2,..n-1]);
    * ...
    * Sum(a[n-1,n-1]) = a[n-1]+Sum([])
    */
    private static int recursion(int[] a,int l){
       if(l==a.length){
           return 0;
       }
        return a[l]+recursion(a,l+1);
    }
    public static int sum(int[] a){
        return recursion(a,0);
    }
    public static void main(String[] args) {
        int[] a = new int[]{12,3,4,5,6,8};
        System.out.println(sum(a));;
    }
}
