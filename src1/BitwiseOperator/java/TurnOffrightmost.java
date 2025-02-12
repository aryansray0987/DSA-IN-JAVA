package BitwiseOperator.java;

public class TurnOffrightmost {
    public static void main(String[] args) {
        //method 1:
        int x=10;
        int y=x;
        int k=0;
        while(true){ //time complexity=O(logN base 2)
            if(y%2==0){
                y=y>>1;
                k++;
            }
            else break;
        }
        System.out.println(k);
         x=x^1<<k;
        System.out.println(x);
        //method 2:
        int n=10;
        System.out.println(n&n-1); //time complexity=O(1)
        //today i will code for myself and also  i am going to make a class thath
        String aryan ="gupta";
        System.out.println(aryan);
        


    }
}
