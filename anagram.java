public class anagram {
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        if(a.length()!=b.length())
            return false;
        int[] c=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c[a.charAt(i)-'a']++;
            c[b.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(c[i]!=0)
                return false;
        }
        return true;}
public static void main(String[] args) {
         System.out.println(isAnagram("ajay", "yaja"));
   }
}
