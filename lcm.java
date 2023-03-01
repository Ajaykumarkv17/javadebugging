public class lcm {
    public static void main(String[] args) {
        int a=16;
        int b=8;
        int max=a>b?a:b;
        int lcm=0;
        for(int i=max;i<=a*b;i++){
                if(i%a==0&&i%b==0){
                    lcm=i;
                    break;
                }
        }
        System.out.println(lcm);
    }
}
