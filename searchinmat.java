public class searchinmat {
    public static void main(String[] args) {
        int a[][] = {{0,1,12,3}, {4,5,6,7}, {8,9,10,11}};;
        int s=6;
        int i=0,j=3;
        int flag=0;
        while(i<3&&j>=0){
            if(a[i][j]==s){
                System.out.print((i+" "+j));
                flag=1;
                break;

            }
            else if(a[i][j]>s){
                j--;
            }
            else{
                i++;
            }
        }
        if(flag==0){
            System.out.println("Not Found");
        }
    }
}
