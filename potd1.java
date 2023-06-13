public class potd1 {
    public static void main(String[] args) {
        int leaves=4;
        int frogs[]={3,2,4};
        int ans=jump(leaves,frogs,frogs.length);
        System.out.println(ans);
    }
    static int jump(int leaves, int frogs[], int N){
        int unvis[]=new int[leaves+1];
     
      for(int i=0;i<N;i++){
         int pos=frogs[i];
         if(pos<=leaves&&unvis[pos]==0){
             int temp=pos;
             while(temp<=leaves){
                 unvis[temp]=1;
                 temp+=pos;
             }
         }
      }
      int c=0;
      for(int i=1;i<=leaves;i++){
          if(unvis[i]==0){
              c++;
          }
      }
      return c;
    }
    }

