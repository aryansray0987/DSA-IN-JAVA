package linkedlist;
class node1{
    int val;
    node1 next;

     node1(int val){//constructor
          this.val=val;
    }
    public node1(){   //for explicitly defining the attributes......

    }
}
public class middle {
//    public static node1 middle(node1 head){
//        node1 temp=head;
//        int len=0;
//        while (temp!=null){
//            temp=temp.next;
//            len++;
//        }
////        System.out.println(len);
//          temp=head;
//        int mid=(len/2)+1;
//        for(int i=0; i<mid-1; i++){
//            temp=temp.next;
//        }
//        return temp;
//
//    }
//
    public static void delete(int n,node1 head){
        //nth node from the last =len-n+1 node form starting
        int len=0;

        node1 temp=head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        if(len==n){  //edge case
            head=head.next;
            return ;
        }
        temp=head;
        for(int i=0; i<len-n-1; i++){
            temp=temp.next;

        }
        temp.next=temp.next.next;


    }
    public static void display(node1 a){
        node1 temp=a;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        node1 n1=new node1(3);
        node1 n2=new node1(33);
        node1 n3=new node1(35);
        node1 n4=new node1(36);
        node1 n5=new node1(38);
        node1 n6=new node1(21);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;
        display(n1);
// node1 middlenode=new node1();  not a efficient way to declare
       // node1 middlenode=middle(n1);// here we are not creating the new node but only pointing towards the node
        // returned by the middle(n1) function....
       // System.out.println(middlenode.val);

        //delete the nth node from the end of linked list....

        delete(6,n1);
        display(n1);
        // question : Find the nth node from the end of the LinkedList...




    }
}
