import java.util.*;
class Node {
    int data;
    Node  left, right;
    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
  }
public class flattenbinarytreeintoll {
    public static void main(String[] args) {
        
  Node  root = new Node(1);
  root . left = new Node(2);
  root . left . left = new Node(3);
  root . left . right = new Node(4);
  root . right = new Node(5);
  root . right . right = new Node(6);
  root . right . right . left = new Node(7);
  flatten(root);
  while(root.right!=null)
  {
      System.out.print(root.data+"->");
      root=root.right;
  }
System.out.print(root.data);
    }
    static void flatten(Node root) {
        Node cur = root;
		while (cur!=null)
		{
			if(cur.left!=null)
			{
				Node pre = cur.left;
				while(pre.right!=null)
				{
					pre = pre.right;
				}
				pre.right = cur.right;
				cur.right = cur.left;
				cur.left = null;
			}
			cur = cur.right;
		}

    }
}
