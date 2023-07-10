import java.util.Scanner;

public class permut {
     public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter a string: "); 
        String s= sc.nextLine();  
        System.out.println("\nAll Permutations of the given string:"); 
        int n = s.length(); 
        permut permutation = new permut(); 
        permutation.permute(s, 0, n-1); 
    } 
     //str=starting index
     //end=end index
    private void permute(String s, int str, int end) 
    {   
        if (str == end) 
            System.out.println(s); 
        else
        { 
            for (int i = str; i <= end; i++) 
            { 
                s = swap(s,str,i); 
                permute(s, str+1, end); 
                s = swap(s,str,i); 
            } 
        } 
    } 
    public String swap(String x, int i, int j) 
    { 
        char temp; 
        char[] charArray = x.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    }   
}
