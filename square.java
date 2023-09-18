public class square{
    public static void main(String[] args){
        int n=5;
        calcsquare(n);
    }
    public static void calcsquare(int n){
        if(n==0)
            return  ;

        
        int square=n*n;
        System.out.println(square);
        n--;
        
        calcsquare(n);
        System.out.println(square);
    }
}