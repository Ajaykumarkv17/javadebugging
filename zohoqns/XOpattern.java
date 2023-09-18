public class XOpattern {
    public static void main(String[] args){
        int n=3;
        for(int i=1-n;i<n;i++){
            for(int j=1-n;j<n;j++){
                if(Math.abs(i)>Math.abs(j)){
                 System.out.print(" ");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println("");
        }

    }
}
