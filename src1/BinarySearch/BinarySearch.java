package BinarySearch;

public class BinarySearch {
    //Each time search space is reduced by half
    //Time complexity =O(Log N);
    public static void main(String[] args) {
        int[] arr={3,5,68,89,105,543};
        int target=1;
         int result=Binarysearch(arr,target);
        if(result==-1) System.out.println("target does not found");
       else System.out.println("index :"+result);

    }
    public static int Binarysearch(int[] arr,int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
