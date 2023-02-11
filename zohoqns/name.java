public class name{
public static void main(String[] args) {
    String s="Zohocorporationteam";
    int k=(s.length()+2)/3;
    for(int i=0;i<k;i++){
        System.out.print(s.charAt(i)+" ");
    }
    int track=k;
    System.out.println();
    for(int j=k-2;j>=1;j--){
        for(int i=1;i<=j;i++){
            System.out.print("  ");
        }
        System.out.print(s.charAt(track++));
        System.out.println();
      
    }
    for(int l=track;l<=s.length();l++){
        System.out.print(s.charAt(l)+" ");
    }
}
}