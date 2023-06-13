import java.util.*;

public class lis {
    /*
     * static List<String> al = new ArrayList<>();
     * public static void main(String[] args) {
     * String s = "abcd";
     * findsubsequences(s, ""); // Calling a function
     * System.out.println(al);
     * }
     * private static void findsubsequences(String s,
     * String ans)
     * {
     * if (s.length() == 0) {
     * al.add(ans);
     * return;
     * }
     * 
     * // We add adding 1st character in string
     * findsubsequences(s.substring(1), ans + s.charAt(0));
     * 
     * // Not adding first character of the string
     * // because the concept of subsequence either
     * // character will present or not
     * findsubsequences(s.substring(1), ans);
     * }
     */

    public static void main(String args[]) {

        int arr[] = { 10, 9, 2, 5, 3, 7, 101, 18 };

        int n = arr.length;

        System.out
                .println("The length of the longest increasing subsequence is " + longestIncreasingSubsequence(arr, n));

    }

    static int longestIncreasingSubsequence(int arr[], int n) {

        int dp[][] = new int[n + 1][n + 1];

        for (int ind = n - 1; ind >= 0; ind--) {
            for (int prev_index = ind - 1; prev_index >= -1; prev_index--) {

                int notTake = 0 + dp[ind + 1][prev_index + 1];

                int take = 0;

                if (prev_index == -1 || arr[ind] > arr[prev_index]) {

                    take = 1 + dp[ind + 1][ind + 1];
                }

                dp[ind][prev_index + 1] = Math.max(notTake, take);

            }
        }

        return dp[0][0];
    }

}
