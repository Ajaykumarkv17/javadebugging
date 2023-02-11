//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine().trim());
            while (T-- > 0) {
                String[] s = br.readLine().trim().split(" ");
                int n = Integer.parseInt(s[0]);
                int m = Integer.parseInt(s[1]);
                char[][] grid = new char[n][m];
                for (int i = 0; i < n; i++) {
                    String[] S = br.readLine().trim().split(" ");
                    for (int j = 0; j < m; j++) {
                        grid[i][j] = S[j].charAt(0);
                    }
                }
                Solution obj = new Solution();
                int ans = obj.numIslands(grid);
                System.out.println(ans);
            }
        }
    }
    // } Driver Code Ends
    
    
    
    
    class Solution {
        // Function to find the number of islands.
        public int numIslands(char[][] grid) {
            int n=grid.length;
            int m=grid[0].length;
            int[][] temp =new int[n][m];
            int count=0;
            for(int row=0; row<n; row++){
                for(int column=0; column<m; column++){
                    if(grid[row][column]=='1' && temp[row][column]==0){
                        count++;
                        bfs(row,column,temp,grid);
                    }
                }
            }
            return count;
        }
        public void bfs(int row,int column,int[][] temp,char[][] grid){
            int n=grid.length;
            int m=grid[0].length;
            temp[row][column]=1;
            Queue<Pair> q=new LinkedList<>();
            q.add(new Pair(row,column));
            while(!q.isEmpty()){
                int ro=q.peek().first;
                int col=q.peek().second;
                q.remove();
                //traversing the neighbours
                for(int delro=-1;delro<=1;delro++){
                    for(int delcol=-1;delcol<=1;delcol++){
                        int nrow=ro+delro;
                        int ncol=col+delcol;
                        if(nrow>=0 && nrow<n && ncol>=0 && ncol<m 
                        && grid[nrow][ncol]=='1' && temp[nrow][ncol]==0){
                            temp[nrow][ncol]=1;
                            q.add(new Pair(nrow,ncol));
                        }
                    }
                }
            }
        }
    }
    class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }