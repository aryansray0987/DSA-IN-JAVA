package Queues;

public class LLImplementation {
    public static class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public static class QueueLL{
        Node head=null;
        Node tail=null;
        int size=0;

        void add(int value){
            Node temp=new Node(value);
            if(size==0){
                head=tail=temp;

            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            else{
                int x=head.value;
                head=head.next;
                size--;
                return x;
            }


        }
        int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            else return head.value;
        }
        void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value+" ");
                temp=temp.next;
            }
            System.out.println();
        }



    }
    public static void main(String[] args) {
        QueueLL Q=new QueueLL();
        Q.add(23);
        Q.add(27);
        Q.add(75);
        Q.add(91);
        Q.add(29);
        Q.display();
        Q.remove();
        Q.display();
        System.out.println(Q.peek());




    }
}
