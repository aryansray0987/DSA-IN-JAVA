package linkedlist;

class linkedlist1{
    node head;
    node tail;
    int size;
    void insertAtStart(int value){
        node temp=new node(value);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }



    void display(){
        node temp=head;
        if(temp==null){
            return;
        }
        while(temp!=null){
            System.out.print(temp.value+ " ");
            temp=temp.next;
        }
        System.out.println();
    }



    int  getElementAtIndex(int idx) throws Error{
        node temp=head;
        if(idx==1){
            return head.value;
        }
        if(idx==size){
            return tail.value;
        }
        if(idx<=0 || idx>size){
           
          throw new Error("invalid idx");

        }
        for(int i=1; i<=idx-1;i++){
            temp=temp.next;
        }
        return temp.value;
    }




    void insertAtEnd(int value){// time complexity O(1) if tail is given else O(n)
        node temp=new node(value);
        if(head==null){
            head=temp;
            tail=temp;

        }
        else{
            tail.next=temp;
            tail=temp;

        }
        size++;
    }
    void insertAtPosition(int idx , int value) {
        if(idx==0){
            insertAtStart(value);
            return;
        }
        if(idx==size){
            insertAtEnd(value);
            return;
        }
        if(idx>size || idx<0){
            System.out.println("invalid index!!");
            return;
        }
        node newnode = new node(value);
        node temp = head;
        for(int i=1; i<idx-1;i++){ // T.C =O(N)  S.C=O(1);
          temp=temp.next;
}
          newnode.next=temp.next; //insertion at idx...
          temp.next=newnode;
          size++;
    }


}
public class Operations {
    public static void main(String[] args) {
        linkedlist1 l1=new linkedlist1();
        l1.insertAtStart(90);
        l1.insertAtStart(45);
        l1.insertAtStart(67);
        l1.insertAtStart(98);
        l1.display();
        l1.insertAtStart(31);
        l1.insertAtStart(73);
        l1.insertAtEnd(31);
        l1.display();


        l1.insertAtPosition(3,45);
        System.out.println(l1.size);
        l1.display();

        System.out.println(l1.getElementAtIndex(0));


    }
}
