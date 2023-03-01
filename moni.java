public class moni {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int a=0,b=n-1;
            for(int j=1;j<=i;j++){
                    int s=a+i;
                    System.out.print(s+" ");
                    a=a+b;
                    b--;
                    
            }
            
            
            System.out.println();
        }
    }
}
