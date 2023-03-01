import mcqs.hack;

public class bitflip {
    public static void main(String[] args) {
        int num1=25;
        int num2=14;
        int ans=flip(num1,num2);
        System.out.println((ans));
    }
    static int flip(int num1,int num2) {

       
        
        return countflip(num1^num2);
    }
    static int countflip(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n&n-1;

        }
        return count;
    }
}
