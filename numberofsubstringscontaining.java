public class numberofsubstringscontaining {
    public static int countSubstring(String S) {
        int char_count[]=new int[3];
        int start=0;int end=0;
        int count=0;
        while(end<S.length()){
            char_count[S.charAt(end)-'a']++;
            while(char_count[0]>0&&char_count[1]>0&&char_count[2]>0){
                count=count+S.length()-end;
                char_count[S.charAt(start++)-'a']--;
            }
            end++;
        }
        return count;
    
}
public static void main(String[] args) {
    String s="abcaba";
    int n=countSubstring(s);
    System.out.print(n);
}
}
