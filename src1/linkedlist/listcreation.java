package linkedlist;
class node{
    int value;
    node next;

    node(int value){ //constructor

        this.value=value;
    }
    public node(){// so that we can define the new node without using the constructor also like a.node=90;

    }
}
 class listcreation {
    //display recursively
    public static void displayrecursively(node head){
        if(head==null){
            return;
        }
        System.out.print(head.value +" ");
        displayrecursively(head.next);
    }


    public static void linkedlisttraversal(node head){
        if(head==null){
            System.out.println("linkedlist is empty:");
            return;
        }
         node temp=head;
         while(temp!=null){
             System.out.println(temp.value);
             temp=temp.next;
         }
        System.out.println();
    }

    public static void main(String[] args) {
        node a=new node(3); //node  is created
       // System.out.println(a.value);
//        System.out.println(a);  address location of node...
        node b=new node(1);
        node c=new node(4);
        node d=new node(6);
        node e=new node(8);

     //   node p= a   shallow copy of the node is created

//linking of the nodes
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;




     //   System.out.println(a.next.next.value); =c.value
     //print the value of list using loop
         linkedlisttraversal(a);
         displayrecursively(a);


    }
}
