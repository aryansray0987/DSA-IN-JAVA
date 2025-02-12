package practicesectionjava;

public class problem6 {
    public static void main(String[] args) {
        //find the subarray with the maximum sum and return the maximum sum

        int[] arr={10,20,1,3,-40,80,-30};
//        int i=0; int j=1; int k=2;
//        int maxsum=Integer.MIN_VALUE;
//        while(k<arr.length){
//            if(arr[i]+arr[j]+arr[k]>maxsum){
//                maxsum=arr[i]+arr[j]+arr[k];
//
//            }
//            i++; k++; j++;
//        }
//        System.out.println(maxsum);


    //method :2   Sliding window approach...
        int k=3; //  size of SubArray.....
        int maxsum=0;
        int i=0; int j=k-1; int sum=0;
        for(int a=0; a<=j;a++ ){
            sum+=arr[a];

        }
        i++; j++;
        while (j<arr.length){
            sum=sum-arr[i-1]+arr[j];
            maxsum=Math.max(maxsum,sum);
            i++; j++;
        }

        System.out.println(maxsum);
    }
}
