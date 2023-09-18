public class madam {
    public static void main(String[] args){
        String s="Mathiiiiii";
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
        for(int j=0;j<row;j++){
            if(j==mid){
                int temp=start;
                start=end;
                end=temp;
            }
            for(int i=0;i<n;i++){
                if(i==start||i==end){
                    System.out.print(s.charAt(i));

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
