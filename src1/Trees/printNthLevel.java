package Trees;

import java.util.Scanner;

public class printNthLevel {
    static int n=3;
    public static void printnthLevel(Node root,int level){

        //we can also use for loop here  to print all the node levelOrder...
        //also we can do level order traversal using DFS without using BFS...

        if(root==null)return;
        //here we travel PreOrder traversal root- > left- > right
        //although ,it can also be done through Inorder and PostOrder traversal also
        if(level==n){
            System.out.print(root.value+" ");
        }
             printnthLevel(root.left,level+1);
             printnthLevel(root.right,level+1);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node a=new Node(1);//Root NOde
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        f.right=h;
        System.out.println("Enter the level:");
        n=sc.nextInt();
        printnthLevel(a,0);
    }
}
