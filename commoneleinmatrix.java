import java.util.*;
 
public class commoneleinmatrix
{
    static int M = 4;
    static int N =5;
     
    static void printCommonElements(int mat[][])
    {
     
        Map<Integer,Integer> mp = new HashMap<>();
         
        for (int j = 0; j < N; j++)
            mp.put(mat[0][j],1);
             
        for (int i = 1; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i)
                {
                    mp.put(mat[i][j], i + 1);
                    if (i == M - 1)
                        System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int mat[][] =
        {
            {1, 2, 1, 4, 8},
            {3, 7, 8, 5, 1},
            {8, 7, 7, 3, 1},
            {8, 1, 2, 7, 9},
        };
     
        printCommonElements(mat);
    }
}