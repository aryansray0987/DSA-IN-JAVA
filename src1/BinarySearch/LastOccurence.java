package BinarySearch;

public class LastOccurence {
    public static int lastOccurence(int[] arr,int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int flag=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                 flag = mid;
                 start=mid+1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else end = mid - 1;
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,4,4,4,4,4,5};
        int target=1;
        int result=lastOccurence(arr,target);
        System.out.println(result);
    }
}
