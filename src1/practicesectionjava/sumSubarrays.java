package practicesectionjava;

public class sumSubarrays {
    public static void main(String[] args) {
        //brute force approach
        //subarrays whose sum id equal to the given target
        int[] arr={1,2,3};
        int target=3;
        int sum=0;
        int count=0;
        for(int i=0; i<arr.length; i++){

            for(int j=i; j<arr.length; j++){

                sum=sum+arr[j];
                if(sum==target){
                    count++ ;
                    break;
                }

            }
            sum=0;
        }
        System.out.println(count);
    }
}
