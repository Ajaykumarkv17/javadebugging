public class fibbonaci {
    
    
    public static void main(String[] args){ 
        /* 
        int n=5;                               //normal method
        int a=0;
        int b=1;
        
        System.out.println(0);
        System.out.println(b);
        while(n>0){
        
            
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            
            
            n--;

        }
     
        //recursion method
        int n=6;
        int a=fib(n);
        System.out.println(a);
    }
    static int fib(int n){
        if(n<=1){
            return n;
        }
        return (fib(n-1)+fib(n-2));
         
    }*/
    //DP APPROACH
      int n=7;
      int  arr[]=new int[7];
      arr[0]=1;
      if(n>1){
        arr[1]=1;
      }
      for(int i=2;i<n;i++){
        arr[i]=arr[i-1]+arr[i-2];
      }
     for (int i =0;i<arr.length;i++) {
        System.out.print(" "+arr[i]);
     }
}
}
