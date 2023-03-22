public class countandsay {
    public static void main(String[] args) {
        int n=5;
        String s=convert(n);
        System.out.println(s);
    }
    static String convert(int n) {
        if(n == 1) return "1";
        String s = convert(n-1);
        StringBuilder res = new StringBuilder();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count++;
            if(i == s.length()-1 || s.charAt(i) != s.charAt(i+1)){
                res.append(count).append(s.charAt(i));
                count = 0;
            }
        }
        return res.toString();
           
        
    }
}
