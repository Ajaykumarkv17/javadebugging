import java.util.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

}

public class levelorder {
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(78);
        root.right = new Node(50);
        root.left.left = new Node(90);
        root.right.right = new Node(87);

        // inorder(root);
        insert(root, 45);
        levelordering(root);
    }

    public static void inorder(Node root) {
        if (root != null)
            inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    static void levelordering(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        ArrayList<Integer> al = new ArrayList<Integer>();
        while (!q.isEmpty()) {
            Node temp = q.poll();
            al.add(temp.data);
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }

        }
        for (Integer integer : al) {
            System.out.print(integer + " ");
        }

    }

    public static void insert(Node node, int value) {
        if (value < node.data) { if (node.left != null) { insert(node.left, value); } else { System.out.println(" Inserted " + value + " to left of " + node.data); node.left = new Node(value); } } else if (value > node.data) {
          if (node.right != null) {
            insert(node.right, value);
          } else {
            System.out.println("  Inserted " + value + " to right of "
                + node.data);
            node.right = new Node(value);
          }
        }
   
}
}
