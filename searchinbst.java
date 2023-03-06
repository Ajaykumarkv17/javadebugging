//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    class Node {
        int data;
        Node left;
        Node right;
        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    
    public class searchinbst {
        static void insert(Node root, int key) {
    
            if (key < root.data) {
                if (root.left != null)
                    insert(root.left, key);
                else
                    root.left = new Node(key);
            } else if (key > root.data) {
                if (root.right != null)
                    insert(root.right, key);
                else
                    root.right = new Node(key);
            }
        }
        public static void main(String args[]) {
    
            Scanner sc = new Scanner(System.in);
    
            
                System.out.println("enter total no of nodes");
                int n = sc.nextInt();
                System.out.println("enter the first node");
                int a1 = sc.nextInt();
                Node root = new Node(a1);
                System.out.println("enter from 1st node");
                for (int i = 1; i < n; i++) {
                    
                    int a = sc.nextInt();
                    insert(root, a);
                }
                System.out.println("Enter the search element");
                int s = sc.nextInt();
                System.out.print(search(root, s));
            
                
      
            }
        
    
    // } Driver Code Ends
    
    
   
        // Function to search a node in BST.
       static  boolean search(Node root, int X) {
            while(root!=null){
            if(root.data==X){
                return true;
            }
            else if(root.data<X){
                root=root.right;
            }
            else{
                root=root.left;
            }}
            return false;
        }
    
    }
