import java.util.Scanner;

class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        int maxSteps = 0;
        int currentSteps = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentSteps++;
                maxSteps = Math.max(maxSteps, currentSteps);
            } else {
                currentSteps = 0; // Reset if current building is not taller
            }
        }
        return maxSteps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input prompt
        System.out.println("Enter the number of buildings:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the heights of buildings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.maxStep(arr);
        System.out.println("Maximum consecutive steps with increasing altitude: " + result);
    }
}
