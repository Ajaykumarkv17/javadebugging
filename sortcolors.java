public class sortcolors {
    public static void main(String[] args) {
        int color[]={1,0,0,0,1,1,2,2,2,0,2,1,2,0,0,2,2,1,1};
        int n=color.length;
        DutchNationalFlag(color,n);
        for(int i=0;i<color.length;i++){
            System.out.print(color[i]+" ");
        }

    }
    static void DutchNationalFlag(int color[],int n){
        //Declare 4 variables 
        int low=0;
        int high=n-1;
        int mid=0;
        int temp=0;
        while(mid<high){

            switch(color[mid]){
                    //case 0
                    //here mid pointer is 0
                    case 0:
                    {
                        temp=color[low];
                        color[low]=color[mid];
                        color[mid]=temp;
                        mid++;
                        low++;
                        break;
                    }
                     //here mid pointer is 1
                    case 1:{
                        mid++;
                        break;
                    }
                    case 2:
                    {
                        temp=color[high];
                        color[high]=color[mid];
                        color[mid]=temp;
                        high--;
                        break;

                    }
            }
        }
    }
}
