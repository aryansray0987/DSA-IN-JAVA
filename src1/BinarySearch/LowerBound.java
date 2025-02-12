package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr={3,5,6,9,17,17,23,45,56};
        int n=arr.length;
        int target=18;// 17 will be the lower bound if
        // 17 is not present the next greatest element will be the lower bound
        int lb=n;
        int lo=0; int hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>=target){
                lb=Math.min(mid,lb);
                hi=mid-1;



            }
            else lo=mid+1;
        }
        System.out.println(lb);
    }
}
