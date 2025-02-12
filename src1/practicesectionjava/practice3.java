package practicesectionjava;

public class practice3 {
    // print all the characters of string except a
    public static void main(String[] args) {
        String str="aryan gupta";
        int i=0;
        int n=str.length();
        while(i<n){
            if(str.charAt(i)=='a'){
                i++;

            }
            else{
                System.out.print(str.charAt(i));
                i++;
            }
        }

    }
}
