package linkedlist;


class linkedlist{
    node head;
    node tail;
    int size;

    void insertAtEnd(int value){
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
    void insertAtStart(int value){
        node temp=new node(value);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            temp.next=head;//linked
            head=temp; //assigned
        }
        size++;
    }
    void insertAtIndex(int idx, int value){
        if(idx==0){
            insertAtStart(value);
            return;
        }
        if(idx==size-1){
            insertAtEnd(value);
            return;
        }
        if(idx<0 || idx>size-1){
            System.out.println("invalid index");
            return;
        }
        node temp=new node(value);
        node x=head;
        for(int i=0; i<idx-1; i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }

    void deleteAtIndex(int idx){
        node temp=head;
        if(head==null){
            System.out.println("linkedlist is empty");
            return;
        }
        if(temp.next.next==null){
            tail=temp;
            tail.next=null;
            size--;
            return;
        }
        if(idx==0){
            head=head.next;
        }
        if(idx==1){
            head.next=head.next.next;
        }
        for(int i=0; i<idx-1; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
void display(){
        if(head==null){
            System.out.println("linkedlist is empty");
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ " ");
            temp=temp.next;
        }
    System.out.println();
}


}
public class practicelink {

    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        l1.insertAtEnd(2);
        l1.insertAtEnd(3);
        l1.insertAtEnd(6);
        l1.insertAtEnd(4);
        l1.display();
       // System.out.println(l1.size);
        l1.insertAtStart(56);
        l1.insertAtStart(45);
        l1.display();
        l1.insertAtIndex(3,12);
        l1.display();
        l1.deleteAtIndex(3);
        l1.display();
        //l1.deleteAtStart();
        //l1.deleteAtEnd();
        System.out.println(l1.size);

    }
}

