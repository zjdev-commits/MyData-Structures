/*给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
不能使用除法。*/
public class Arrays2 {
    public int[] multiply(int[] A) {
   /*
    O(N^2)
    if(A.length==0){
            return null;
        }
        int[] B = new int[A.length];
        for(int i=0;i<A.length;i++){
            int sum=1;
            for(int j=0;j<A.length;j++){
                if(i==j){
                    continue;
                }
                sum *= A[j];
            }
            B[i] = sum;
        }
        return B;
    }*/
      /*
        int[] B = new int[A.length];
        int sum;
        for (int i = 0; i < A.length; i++) {
            sum = 1;
            for (int j = 0; j < i; j++) {
                sum *= A[j];
            }
            for (int j = i + 1; j < A.length; j++) {
                sum *= A[j];
            }
            B[i] = sum;
        }
        return B;*/
        int temp=1;
        int[] B = new int[A.length];
        B[0] = 1;
        for (int j = 1; j < A.length; j++) {
            B[j] = B[j-1]*A[j-1];
        }
        for (int j = A.length-2; j >=0; j--) {
            temp *=A[j+1];
            B[j] *= temp;
        }
        return B;
    }
}
