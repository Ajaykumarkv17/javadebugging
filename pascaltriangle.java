import java.util.*;
public class pascaltriangle {
   static ArrayList<Long> nthRowOfPascalTriangle(int n) {
        if(n==1)
        {
                    ArrayList<Long> v = new ArrayList<>();
                    v.add(1l);
                    return v;
        }
        final long MOD = 1000_000_007;
        
        ArrayList<Long> v = new ArrayList<>();
        ArrayList<Long> tans = nthRowOfPascalTriangle(n-1);
        v.add(1l);
      
        for (int i = 1; i < n-1; i++) {
            v.add((tans.get(i)+tans.get(i-1))%MOD);
            //c = ((c % MOD * (n - i)) % MOD * mod.get(i)) % MOD;
        }
        v.add(1l);
        return v;
    }
    public static void main(String args[]){
        int n=7;
        ArrayList<Long>a=new ArrayList<>( nthRowOfPascalTriangle(n));
        for(Long i:a){
            System.out.print(i+" ");    
        }
        
    }

}
