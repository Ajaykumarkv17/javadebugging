import java.util.*;;
public class stringpattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        int n=s.length();
        int mid=n/2;
        int start=mid,end=mid;
        int row=n;
        if(n%2==0){
            mid-=1;
            start=mid;
            end=mid+1;
            row-=1;
        }
        for(int i=0;i<row;i++){
            if(i==mid){
                int temp=start;
                start=end;
                end=temp;
            }
            for(int j=0;j<n;j++){
                if(j==start||j==end){
                    System.out.print(s.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
                
            }
            start--;
            end++;
            System.out.println();
            
        }
    }
}
