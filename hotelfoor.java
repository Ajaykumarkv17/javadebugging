import java.util.* ;
import java.io.*; 
public class hotelfoor {
  public static int hotelBookings(List<String> queries)
  {
       int count=0;
     for(int i=0;i<queries.size();i++){
       if(queries.get(i).charAt(0)=='+'){
         count++;
       }
     }
     return count;
      
  }
  public static void main(String[] args) {
    List<String>queries=new ArrayList<String>();
    queries.add("+1A");

    int ans=hotelBookings(queries);
    System.out.println(ans);
  }
}