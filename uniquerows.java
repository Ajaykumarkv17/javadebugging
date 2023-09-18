public class uniquerows {
    static int low(int mat[],int n,int sum){
        //{0,0,1,1,1}
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(mat[mid]>=sum){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }


        return ans;
    }


    static int find(int mat[][],int n,int m){
        int ind=-1;
        int max_cnt=0;
        for(int i=0;i<n-1;i++){
            int c_cnt=m-low(mat[i],m,1);
            if(c_cnt>max_cnt){
                max_cnt=c_cnt;
                ind=i;
            }
        }




        return ind;
    }
    public static void main(String[] args) {
        //maxnoofones
        int mat[][]={{0,0,1,1,1},{0,0,0,0,0},{0,0,0,1,1},{0,0,1,1,1},{0,0,1,1,1}};
        int n=5;
        int m=5;
        int ans=find(mat,n,m);
        System.out.println(ans);



    }
}
/*class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
     
        HashSet<String> st=new HashSet<>();
        ArrayList<ArrayList<Integer>> vec=new ArrayList<>();
        
        for(int i=0;i<r;i++)
        {
            StringBuilder curr=new StringBuilder();
            for (int j = 0;j < c;j++)
            {
                curr.append('0'+a[i][j]);
            }
            st.add(curr.toString());
        }
        for(int i=0;i<r;i++)
        {
            StringBuilder curr=new StringBuilder();
            for (int j = 0;j < c;j++)
            {
                curr.append('0'+a[i][j]);
            }
            if (st.contains(curr.toString()))
            {
                st.remove(curr.toString());
                ArrayList<Integer> demo=new ArrayList<>();
                for (int j = 0;j < c;j++)
                {
                    demo.add(a[i][j]);
                }
                vec.add(demo);
            }
        }
        return vec;
    }
} */