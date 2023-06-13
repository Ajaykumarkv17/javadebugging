public class alternatestrings{
    public static void main(String[] args) {
        String word1="pq";
        String word2="rsto";
        String ans= mergeAlternately( word1,  word2);
        System.out.println(ans);
    }
    public static String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int alarge=0;
        int blarge=0;
        if(n>m){
             alarge=n-m;
        }
        else{
             blarge=m-n;
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<n&&i<m;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        
        if(blarge>0){
            for(int i=sb.length();i<m+n;i++){
                sb.append(word2.charAt(i));
            }
        }
        if(alarge>0){
           for(int i=sb.length();i<m+n;i++){
                sb.append(word1.charAt(i));
            } 
        }
        return sb.toString();
    }
}