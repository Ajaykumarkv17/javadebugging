public class np {

    static void find(int n){
        if(n==1||n==2){
            System.out.print(n+2);
            return;
        }
        n--;
    find(n/2);
    System.out.print(n%2+3);
    }
    public static void main(String[] args){
        int n=15;
        for(int i=1;i<n;i++){

        find(i);
    }
    }   
}
