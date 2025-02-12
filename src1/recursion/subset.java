package recursion;

import java.util.ArrayList;

public class subset {
    //program to print the subset of a given set ...
     static ArrayList<String> arr=new ArrayList<>();
    public static void printSubset(int idx,String str,String ans){
        if(idx==str.length()){
           arr.add(ans);
            return;
        }
        char ch=str.charAt(idx);
        printSubset(idx+1,str,ans+ch);//take
        printSubset(idx+1,str,ans);//not take 
    }
    public static void main(String[] args) {
        String str="abc";
        printSubset(0,str,"");
        System.out.println(arr);
    }
}
