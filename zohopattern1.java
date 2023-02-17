/*
 P             P
   R         R
     O     O
        G
      R    R 
     A       A
  M            M

 */
public class zohopattern1 {
    public static void main(String[] args) {
        String s="PROGRAM";
        int n=(s.length()*2)-2;
        int start=0;
        int end=n;
        int j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
        for(int i=0;i<=n;i++){
            if(i==start)
                System.out.print(ch);
            
            if(i==end)
                System.out.print(ch);
            
            else
                System.out.print(" ");
            
            if(i==n)
            System.out.println("");}
            
            start+=2;
            end-=2;
            j++;

        }




    }
}
