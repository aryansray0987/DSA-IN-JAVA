package Trees;

public class SumProductMaxNodes {
    public static int sumnodes(Node root){
        if(root==null){
            return 0;
        }
        int sum= root.value+sumnodes(root.left)+ sumnodes(root.right);
        return sum;


    }
    public static int productNodes(Node root){
        if(root==null) return 1;
        return root.value*productNodes(root.left)*productNodes(root.right);
    }
   //product of nodes with non-zero value .
    public static int nonZeroProduct(Node root){
        if(root==null){
            return 1;
        }
        if(root.value==0){
           return 1;
        }

        return root.value*nonZeroProduct(root.left)*nonZeroProduct(root.right);

    }
    public static int maxNode(Node root){
        if(root==null) return Integer.MIN_VALUE;
      return  Math.max(root.value,Math.max(maxNode(root.left),maxNode(root.right)));

    }

    public static int minNode(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return  Math.min(root.value,Math.min(minNode(root.left),minNode(root.right)));

    }
    public static int size(Node root){
        if(root==null) return 0;
        return size(root.left)+size(root.right)+1;
    }
    public static int level(Node root){
        if(root==null ) return 0;
        return 1+ Math.max(level(root.left),level(root.right));
    }

    public static void main(String[] args){
        Node a=new Node(1);//Root NOde
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        int x=sumnodes(a);
        System.out.println(x);

        int y=productNodes(a);
        System.out.println(y);
        int z=nonZeroProduct(a);
        System.out.println(z);
        System.out.println(maxNode(a));
        System.out.println(minNode(a));
        System.out.println(size(a));
        System.out.println(level(a));


    }
}
