import java.util.*;
public class votes{
static String find(ArrayList<String>votes){
            String ans="";
            int n=votes.size();
            int maxvote=0;
            for(int i=0;i<n;i++){
                int curr=0;
    
                for(int j=0;j<n;j++){
                    if(votes.get(i).equals(votes.get(j))){
                        curr=curr+1;
                    }
    
                }
                if(curr>maxvote){
                    maxvote=curr;
                    ans=votes.get(i);
                }
                if(curr==maxvote){
                    if(ans.compareTo(votes.get(i))>0){
                        ans=votes.get(i);
                    }
                }
    
            }
            return ans;
        }
    public static void main(String[] args) {
        
        ArrayList<String>al=new ArrayList<>();
        al.add("John");
        al.add("durai");
        al.add("joe");
        al.add("john");
        al.add("joe");
        String ans=find(al);
        System.out.println(ans);
    }
}