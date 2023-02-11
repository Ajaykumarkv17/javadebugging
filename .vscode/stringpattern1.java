import java.util.*;
public class stringpattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int mid=n/2;
        int ans=n+mid;
        for(int i=1;i<=n;i++){
            for(int j=mid;j<=ans-i;j++){
                System.out.print(s.charAt(j%6));
            }
            System.out.println();
        }
    }
}
