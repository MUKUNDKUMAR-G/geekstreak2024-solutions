import java.util.Scanner;

class Solution {
    // Function to minimize cost
    public int minimizeCost(int k, int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];
        
        // Base case: cost to reach the first stone is 0
        dp[0] = 0;
        
        // Fill the dp array
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= k && i-j >= 0; j++) {
                int cost = Math.abs(arr[i] - arr[i-j]) + dp[i-j];
                dp[i] = Math.min(dp[i], cost);
            }
        }
        
        // Return the minimum cost to reach the last stone
        return dp[n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.println("Enter the number of stones:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the heights of the stones:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the maximum number of steps (k):");
        int k = sc.nextInt();

        // Calculate the minimum cost
        Solution sol = new Solution();
        int result = sol.minimizeCost(k, arr);

        System.out.println("The minimum cost to reach the last stone is: " + result);
    }
}
