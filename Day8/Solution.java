import java.util.Arrays;
import java.util.Scanner;

class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) {
            return 0;
        }

        Arrays.sort(arr);

        int maxDiff = arr[n - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            int minHeight = Math.min(smallest, arr[i + 1] - k);
            int maxHeight = Math.max(largest, arr[i] + k);

            if (minHeight >= 0) {
                maxDiff = Math.min(maxDiff, maxHeight - minHeight);
            }
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of towers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the heights of the towers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K: ");
        int k = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.getMinDiff(arr, k);
        System.out.println("The minimum difference is: " + result);
    }
}
