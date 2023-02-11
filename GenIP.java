//{ Driver Code Starts
    import java.util.*;
    class GenIP {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s=sc.next();
            int t = sc.nextInt();
            while (t-- > 0) {
                //String s = sc.next();
                Solution sln = new Solution();
                ArrayList<String> str = sln.genIp(s);
                Collections.sort(str);
                if(str.size() == 0)
                    System.out.println(-1);
                else{
                    for (String u : str) {
                        System.out.println(u);
                    }
                }
            }
        }
    }
    // } Driver Code Ends
    
    
    /*complete the Function*/
    
    class Solution {
        public ArrayList<String> genIp(String s) {
            ArrayList<String> ip=new ArrayList<>();
            int n=s.length();
            if(n>12){
                ip.add("-1");
                return ip;
            }
            for(int i=0;i<n-2;i++){
                for(int j=i+1;j<n-1;j++){
                    for(int k=j+1;k<n;k++){
                        String a=s.substring(0,i);
                        String b=s.substring(i,j);
                        
                        String c=s.substring(j,k);
                        String d=s.substring(k,n);
                        
                        if(valid_ip(a)&&valid_ip(b)&&valid_ip(c)&&valid_ip(d)){
                            ip.add(a+"."+b+"."+c+"."+d);
                        }
                        
                    }
                }
            }
            return ip;
        }
         boolean valid_ip(String a){
            int n=a.length();
           
            if(n==0||n>3||(a.charAt(0))=='0'&&n>1||Integer.parseInt(a)>255){
                return false;
            }
            else
              return true;
        }
    }
