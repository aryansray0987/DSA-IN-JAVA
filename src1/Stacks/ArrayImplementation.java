package Stacks;
 class Stack {
     int[] arr = new int[5];
    static int idx = 0;

     void push(int x) {
         if (idx == arr.length) {
             System.out.println("stack overflow");
             return;
         }
         arr[idx] = x;
         idx++;
     }

     int peek() {
         if (idx == 0) {
             System.out.println("stack underflow");
             return -1;
         }
         return arr[idx - 1];
     }

     int pop() {
         if (idx == 0) {
             System.out.println("stack is underflow/empty");
             return -1;
         }
         int top = arr[idx - 1];
         arr[idx - 1] = 0;
         idx--;
         return top;
     }

     void display() {
         if (idx == 0) {
             System.out.println("stack is empty ");
             return;
         }
         for (int i = 0; i <= idx - 1; i++) {
             System.out.print(arr[i] + " ");
         }
     }

     int size() {
         return idx;
     }

     boolean isempty() {
         if (idx == 0) {
             return true;
         }
         return false;
     }

     boolean isfull() {
         if (idx == arr.length) {

             return true;
         }
         return false;
     }
 }


     public class ArrayImplementation {


         public static void main(String[] args) {
             Stack st = new Stack();
             st.push(5);
             st.push(10);
             st.push(12);
             st.push(34);
             st.push(78);
             //  st.push(32);

             st.display();
             System.out.println();
             System.out.println(st.peek());
             //   st.pop();
             st.display();
             System.out.println();
             System.out.println(st.size());

             System.out.println(st.isfull());
             System.out.println(st.isempty());


         }
     }

