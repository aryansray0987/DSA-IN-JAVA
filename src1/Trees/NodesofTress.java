package Trees;

class Node{
    int value;
    Node left;
    Node right;

    //constructor
    Node(int value) {
        this.value = value;
    }
}

public class NodesofTress {
    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.value+ " ");
        display(root.left);
        display(root.right);
    }
    public static int noOfNodes(Node root){
        if(root==null) return 0;
        return 1+noOfNodes(root.left)+noOfNodes(root.right);
    }  //have faith in recursion ...


    public static void main(String[] args) {
        //creation of the Nodes
        Node a=new Node(1);//Root NOde
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(5);
        Node g=new Node(7);


        //connections
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=g; c.right=f;


        display(a);
        System.out.println();
        System.out.println(noOfNodes(a));



    }

}
