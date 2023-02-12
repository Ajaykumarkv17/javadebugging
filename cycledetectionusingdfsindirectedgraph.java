import java.util.*;
public class cycledetectionusingdfsindirectedgraph {
   static  public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[]=new int[V];
        int pathvis[]=new int[V];
        for(int i=0;i<V;i++){
            if(dfs(i,adj,vis,pathvis)==true){
                return true;
            }
        }
        return false;
     }
   static  boolean dfs(int node,ArrayList<ArrayList<Integer>>adj,int vis[],int pathvis[]){
         vis[node]=1;
         pathvis[node]=1;
         for(int it:adj.get(node)){
             if(vis[it]==0){
             if(dfs(it,adj,vis,pathvis)==true){
                 return true;
             }
             }
             else if(pathvis[it]==1){
                 return true;
             }
         }
         pathvis[node]=0;
         return false;
     }
     public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i <11; i++) {
            adj.add(new ArrayList < > ());
        }
        
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(2).add(6);
        adj.get(3).add(4);
        adj.get(4).add(5);
        adj.get(7).add(1);
        adj.get(7).add(8);
        adj.get(8).add(9);
        adj.get(9).add(5);


      
        
        
     

       
        boolean ans =isCyclic(10, adj);
        if(ans)
            System.out.println("1");
        else System.out.println("0");
     }
}
