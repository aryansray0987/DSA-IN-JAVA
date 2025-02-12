package BinarySearch;

public class firstandlastOccurence {
    public static void main(String[] args) {
        //T.C=O(N)..
        int[] arr={10,10,20,20,20,20,30,30,40,50};
        int n=arr.length;
        int start=0;
        int end=n-1;
        int target=90;
        boolean flag=false;
        while(start<n){
            if(arr[start]==target){
                flag=true;
                System.out.println("first occurence :"+ start);
                break;

            }
            start++;
        }
        while(end>=0){
            if(arr[end]==target){
                flag=true;
                System.out.println("last occurence: "+ end);
               break;
            }
            end--;
        }
        if(flag==false) System.out.println("element does not found");
    }
}
