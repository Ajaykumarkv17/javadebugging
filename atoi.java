public class atoi {
   static int atoi(String str) {
	    int num=0,mlt=1;
	    for(int i=0;i<str.length();i++)
	        {   
	            char temp = str.charAt(i);
	            if(temp=='-' && i>0)
	                {
	                    return -1;
	                }
	             else if(temp=='-' && i==0)
	                    {
	                        mlt=-1;
	                        continue;
	                    } 
	             if(temp<48 || temp>57)
	               return -1;    
	            num = num*10+(temp-48);    
	            
	        }
	    return num;      
    }
    public static void main(String[] args){
        String s="123";
        int ans=atoi(s);
        System.out.println(ans);
    }
}
