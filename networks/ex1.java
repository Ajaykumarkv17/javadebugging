package networks;
import java.net.*;
import java.io.*;
public class ex1 {
    public static void main(String[] args) {
        String url ="www.google.com";
        int portno=3456;
     
        try {
            Socket s=new Socket(url,portno);
            PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            pw.println("GET / HTTP/1.1\nHost:www.google.com\n\n");
            String inputline;
            while((inputline=br.readLine())!=null){
                System.out.println(inputline);
            }
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(1);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(1);
        }
    }
}
