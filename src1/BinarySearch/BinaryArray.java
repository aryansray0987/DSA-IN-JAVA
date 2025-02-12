package BinarySearch;

public class BinaryArray {
    //Given a binary Array calculate the total number of one's
    public static void main(String[] args) {

 //Time Complexity=O(N)..

        int[] arr = {0,0,0,0,1,1,1,1,1,1};
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int idx = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == 1) {
                idx = mid;
                end=mid-1;

            }
            else start=mid+1;
        }
        int NoOfOne=n-idx;
        System.out.println(NoOfOne);
    }
}
