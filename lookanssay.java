public class lookanssay {
    public static void main(String[] args){
        int n=5;
        System.out.println(1);
        String s="1";
        int j=1;
        while(j<n){
            String new_s="";
            int count=1;
            char a=s.charAt(0);

            for(int i=1;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(i-1)){
                    System.out.print(""+count+" "+a+" ");
                    new_s+=""+count+""+a;
                    a=s.charAt(i);
                    count=1;
                    //s=new_s;
                    
                }
                else{
                    count++;
                }
                
            }
           
            System.out.println(""+count+" "+a);
            new_s+=""+count+""+a;
            s=new_s;
            
            j++;
            System.out.println("");
        }


    }
}
