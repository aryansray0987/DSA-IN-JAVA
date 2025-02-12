package BinarySearch;

public class BinarySearch2 {
    public static void main(String[] args) {
        //sorted in decreasing order
        int[] arr={89,56,45,39,32,25,7,2};
        int target=25;
        int idx=BinarySearch(arr,target);
        System.out.println("Element is found at index: "+ idx);
    }
    public static int BinarySearch(int[] arr,int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){ //Conditions are opposite of the sorted in increasing order
                start=mid+1;
            }
            else end=mid-1;
        }
        return -1;
    }
}
