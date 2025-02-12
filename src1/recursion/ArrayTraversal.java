package recursion;

public class ArrayTraversal {

//    public static void print(int[]arr, int idx){
//        int n=arr.length;
//        if(idx==n-1){
//            System.out.println(arr[idx]);
//            return;
//        }
//        System.out.println(arr[idx]);
//        print(arr,idx+1);
//   }
    public static void print(int[] arr, int n){
        if(n==0){
            System.out.println(arr[0]);
            return;
        }
        print(arr,n-1);
        System.out.println(arr[n]);




    }
    public static void main(String[] args) {
        int[] arr={12,34,54,43,24,16};
        int n=arr.length;
        print(arr,n-1);
    }
}
