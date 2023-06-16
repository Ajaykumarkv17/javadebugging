import java.util.Arrays;

import java.io.*; 
/*
    Time Complexity: O(N)
    Space Complexity: O(N)

    where N is where N is the number of cars.
*/

import java.util.*;
public class ansihcars {
    public static void main(String[] args) {
        int position[]={10,8,0,5,3};
        int speed[]={2,4,1,1,3};
        int target=12;
        int n=5;
        int ans=find(n, position, speed, target);
        System.out.println(ans);
    }
    
    public static int find(int n, int[] position, int[] speed, int d) {
        
         int ans = 0;
    
        int[][] cars = new int[n][];

        // Sorting the cars by the position they have to cover.
        for(int i = 0; i < n; i++){
            cars[i] = new int[]{d - position[i], speed[i]};
        }
        
        Arrays.sort(cars ,(a,b)->a[0]-b[0]);

        // Finding the number of unique arriving time of the cars.
        float ma = 0;
        for (int i = 0; i < n; i++){
            float t = (float)cars[i][0] / cars[i][1];
            if (t <= ma){
                continue;
            }
            else{
                ans += 1;
                ma = t;
            }
        }
        return ans;

    }
}
