
package Stacks;

import java.util.Stack;

public class linkedlistImplementation {
    public static class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }
    public static class Stack{
        Node head=null;//Initially stack is empty
      static  int size=0;
        void push(int val){ //inserting in the beginning of the LinkedList
            Node temp=new Node(val);
            temp.next=head;
            head=temp;
            size++;

        }
        Node head(){
            return head;
        }
        boolean isEmpty(){
            if(size==0)return true;
            else return false;
        }
        void displayrec(Node head){//correct way of printing the elements of stack
            Node temp=head;
            if(temp==null)return;
            displayrec(temp.next);
            System.out.print(temp.value+" ");
        }
        void display(){//here we are printing the elements of stack in reverse order--incorrect way
           Node temp=head;
           while(temp!=null) {
               System.out.print(temp.value+ " ");
               temp=temp.next;
           }

        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int temp=head.value;
            head=head.next;
            size--;
            return temp;
        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            return head.value;
        }


    }
    public static void main(String[] args){
        Stack st=new Stack();

        st.push(4);
        st.push(45);
        st.push(98);
        st.push(21);

        Node head1=st.head();
        st.displayrec(head1);
        System.out.println();
        System.out.println(st.size());
        System.out.println( st.peek());
        st.pop();
        System.out.println(st.size());


    }
}