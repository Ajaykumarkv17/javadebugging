//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException
    {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            Solution T = new Solution();
            int target = Integer.parseInt(br.readLine().trim());
            int k = Integer.parseInt(br.readLine().trim());
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = T.KDistanceNodes(root,target,k);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right;
// }

class Solution
{
    
    private static Node target_node = null;
    
    private static void markParents(Node root, Map<Node, Node> parent_track, int target){
        Queue<Node> q = new LinkedList<Node>();
        q.offer(root);
        while(!q.isEmpty()){
            Node current = q.poll();
            if(current.data == target){
                target_node = current;
            }
            
            if(current.left != null){
                q.offer(current.left);
                parent_track.put(current.left, current);
            }
            
            if(current.right != null){
                q.offer(current.right);
                parent_track.put(current.right, current);
            }
        }
    }
    
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        // return the sorted list of all nodes at k dist
        Map<Node, Node> parent_track = new HashMap<>();
        markParents(root, parent_track, target);
        Queue<Node> q = new LinkedList<>();
        Map<Node, Boolean> visited = new HashMap<>();
        // find the target node
        // findNode(root, target);
        // System.out.println(target_node.data);
        
        q.offer(target_node);
        visited.put(target_node, true);
        int distance = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            if(distance == k)   break;
            distance++;
            for(int i=0; i<size; i++){
                Node curr = q.poll();
                if(curr.left != null && visited.get(curr.left) == null){
                    q.offer(curr.left);
                    visited.put(curr.left, true);
                }
                if(curr.right != null && visited.get(curr.right) == null){
                    q.offer(curr.right);
                    visited.put(curr.right, true);
                }
                // Parent Node = parent_track.get(curr)
                if(parent_track.get(curr) != null && visited.get(parent_track.get(curr)) == null){
                    q.offer(parent_track.get(curr));
                    visited.put(parent_track.get(curr), true);
                }
            }
            
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll().data);
        }
        Collections.sort(ans);
        return ans;
    }
};
