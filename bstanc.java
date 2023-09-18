
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BST {
    public   Node root;

    public BST() {
        root = null;
    }

    // Function to insert a value into the BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive function to insert a value into the BST
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Function to perform an inorder traversal of the BST
    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }
        Node LCA(Node node, int n1, int n2)
	{
           if(node==null){
               return null;
           }
           if(node.data>n1&&node.data>n2){
               return LCA(node.left,n1,n2);
           }
           if(node.data<n1&&node.data<n2){
               return LCA(node.right,n1,n2);
           }
           return node;
    }
    

}

public class bstanc  {
    public static void main(String[] args) {
        BST bst = new BST();
        
        // Insert values into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Perform an inorder traversal to display the sorted values
        Node LCA= bst.LCA(bst.root,30, 40);
        System.out.println(LCA.data);
        //System.out.println("Inorder Traversal of BST:");
        //bst.inorderTraversal();
    }
}


  
    //Function to find the lowest common ancestor in a BST. 
	


