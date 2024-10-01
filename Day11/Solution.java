import java.util.Scanner;

class Solution {
    // Function to return the count of buildings that can see the sunrise.
    public int countBuildings(int[] height) {
        int count = 1;  // The first building will always see the sunrise
        int max = height[0];  // Set the first building's height as the maximum

        // Traverse through the rest of the buildings
        for (int i = 1; i < height.length; i++) {
            if (height[i] > max) {
                count++;  // Increment the count if the current building is taller than the max
                max = height[i];  // Update the max height
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of buildings: ");
        int n = sc.nextInt();

        int[] height = new int[n];
        System.out.println("Enter the heights of the buildings: ");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.countBuildings(height);

        System.out.println("Number of buildings that can see the sunrise: " + result);
    }
}
