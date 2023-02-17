import java.util.*;
public class countnicesubarrays {
    public static int countSubarray(int n, int[] nums, int k) {
       
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i] =1;
            }
        }
        HashMap<Integer,Integer> map = new HashMap();
        map.put(0,1);
        int sum=0,count=0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
            return count;
    
    }
    public static void main(String[] args) {
        int nums[]={1,1,2,1,1};
        int n=nums.length;
        int k=3;
        int ans=countSubarray(n, nums, k);
        System.out.print(ans);
    }
}
