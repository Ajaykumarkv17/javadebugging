public class square{
    public static void main(String[] args){
        int n=5;
        calcsquare(n);
    }
    public static int calcsquare(int n){
        if(n==0){
            return  1;

        }
        int square=n*n;
        System.out.println(square);
        n--;
        return calcsquare(n);
    }
}