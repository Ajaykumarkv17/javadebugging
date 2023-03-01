
/*
 madam
      d
     a  a
    m    m
     a  a
       d
 */



public class palindromechar {
    public static void main(String[] args) {
        String s="MADA";
        int n=s.length();
        int mid=n/2;
      
        int start=mid;
        int end=mid;
        int row=n;
        
            if(n%2==0){
                mid-=1;
                start=mid;
                end=mid+1;
                row-=1;
            }
            for (int i = 0; i < row; i++) {
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
    
}}
