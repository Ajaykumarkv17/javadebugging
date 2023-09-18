public class permuta {


   static boolean sho(char str[],int start,int curr){
    for(int i=start;i<curr;i++){
        if(str[i]==str[curr]){
            return false;
        }
    }
    return true;
   } 
  static void findper(char str[],int ind,int n)
{
    if(ind>=n){
        System.out.println(str);
        return;
    }
    for(int i=ind;i<n;i++){
        boolean check=sho(str,ind,i);
        if(check){
            swap(str,ind,i);
            findper(str,ind+1,n);
            swap(str,ind,i);
        }
    }
}
   static void swap(char str[],int i,int j){
    char ch=str[i];
    str[i]=str[j];
    str[j]=ch;

   }


    public static void main(String[] args){
        char str[]={'A','A','C','D'};
        int n=str.length;
        findper(str,0,n);
    }
}
