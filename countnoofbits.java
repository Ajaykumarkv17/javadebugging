public class countnoofbits {
    public static void main(String[] args){
       int sum=15;
       int count=0;
       while(sum>0){
            count++;
            sum=(sum&sum-1);
           

       }
       System.out.println(count);
}
}