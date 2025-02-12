package Stacks;
import java.util.Stack;
public class previousSmallerElement {
    public static void main(String[] args) {
        int[] arr={5,2,4,6,3,2,5};
        int n=arr.length;
        int[] res1=new int[n];
        Stack<Integer> rt=new Stack<>();
        rt.push(arr[0]);
        res1[0]=-1;
        for(int i=1; i<n; i++){
            while(rt.size()>0 && rt.peek()>arr[i]){
                rt.pop();
            }
            if(rt.isEmpty()){
                res1[i]=-1;
            }
            else{
                res1[i]=rt.peek();
            }
            rt.push((arr[i]));
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            System.out.print(res1[i]+" ");
        }
    }
}
