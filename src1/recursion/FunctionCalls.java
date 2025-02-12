package recursion;

public class FunctionCalls {
    public static void mango(){
        System.out.println("we are inside mango ");
    }
  public static void banana(){
      System.out.println("we are inside banana");
      mango();
  }
    public static void apple() {

        System.out.println("we are inside apple");
        banana();

    }
    public static void main(String[] args) {
        System.out.println("we are inside main method");
        apple();
    }
}
