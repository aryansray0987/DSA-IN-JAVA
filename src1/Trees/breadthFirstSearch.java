package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class breadthFirstSearch {
    public static void levelOrder(Node root ){
        Queue<Node> q=new LinkedList<>();
        if(root==null) return;

        q.add(root);
        while(q.size()>0){
            Node temp= q.remove();
            System.out.print(temp.value+" ");
            //right to left traversal...

            if(temp.left!=null)  q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);


            // letf to right traversal...
//             if(temp.right!=null)  q.add(temp.right);
//             if(temp.left!=null) q.add(temp.left);




        }



    }

    public static void main(String[] args) {
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

        System.out.print("BreadthFirstSearch: ");
        levelOrder(a);
    }
}
