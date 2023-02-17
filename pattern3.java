public class pattern3 {
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
          
           for(int i=n-1;i>0;i--){
                for(int j=n-i+1;j>0;j--){
                    System.out.print(" ");
                }
                for(int k=2*i-1;k>0;k--){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            
    


    }
}
