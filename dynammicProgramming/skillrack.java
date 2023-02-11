import java.util.*;
public class skillrack{
    public static void main(String[] args) {
        int a=5;
        int b=11;
        int k=b;
        int matrix[][]=new int[a][a];
        for(int i=0;i<a;i++){
            if(i%2==0){
                for(int j=0;j<a;j++){
                        matrix[i][j]=k++;
                }
            }
            else{
            for(int j=a-1;j>=0;j--){
                matrix[i][j]=k++;
        }}
        System.out.println(" ");
        }
        for(int i=0 ;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
