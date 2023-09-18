public class amcat1 {
    public static void main(String[] args) {
        char arr[]={'a','t','A','i','o','S','s','a'};
        int n=arr.length;
        int ans =laptopproducts(arr,n);
        System.out.print(ans);



    }
    public static int laptopproducts(char[] arr,int n){
        int ans=0;
        char[]laptop={'A','E','I','O','U','a','e','i','o','u'};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < laptop.length; j++) {
                if(arr[i]==laptop[j]){
                    ans=ans+1;
                    
                    
                }
                
            }
        }

        int a=n-ans;
        return a;
    }
}
