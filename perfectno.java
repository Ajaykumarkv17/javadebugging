import java.util.Random;

public class perfectno {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n=8128;
       
        
        int sum=0;
        for(int i=1;i<n;i++){
            
                if(n%i==0){
                     sum=i+sum;    
                }
            }
        
        if(sum==n){
            System.out.print("it is an perfect no");
        }
        else{
            System.out.println("it is not perfect no");    
        }
    }
}
