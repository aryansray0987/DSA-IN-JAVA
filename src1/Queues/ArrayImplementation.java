package Queues;

import java.util.Queue;

public class ArrayImplementation {

    public static class QueueA{
        int f=-1;//front
        int r=-1;//rare
        int size=0;//total size of the queue
        int[] arr=new int[10];

        void add(int value){
            if(size==arr.length){
                System.out.println("Queue is full");
                return;
            }

            if(f==-1){
                f++;
                r++;
                arr[r]=value;
            }
            else{
                r++;
                arr[r]=value;
            }
            size++;
        }
        int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            f=f+1;
            size--;
            return arr[f-1];
        }
        int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }
        void display(){
            if(size==0){
                System.out.println("Queue is empty");
                return;
            }
            for(int i=f; i<=r; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        QueueA q=new QueueA();
        q.display();
        q.add(34);
        q.add(54);
        q.add(63);
        q.add(31);
        q.add(31);
        q.add(31);
        q.add(31);
        q.add(31);
        q.add(31);
        q.add(31);
        q.display();
        q.remove();
        System.out.println();
        q.add(31);
        System.out.println();
        q.display();
        System.out.println();
        System.out.println(q.peek());


    }
}
