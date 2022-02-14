import java.util.*;
import java.io.*;

class Node
{
   int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

class tasl5-5 {
   
  	public static void pre( Node root ) {
      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
       pre(root.left);
        pre(root.right);
     
    }
	public static Node insert(Node root,int value) {
        if(root==null)
  return new Node(value);
 else if(root.data>value)
      root.left=insert(root.left,value);
  else (root.data<value)
      root.right=insert(root.right,value);
  return root;

    	
    }

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          Node root = null;
        int x= input.nextInt();
     
        while(x-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        input.close();
      	pre(root);
    }	
}
