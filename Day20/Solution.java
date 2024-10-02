import java.util.Scanner;

class Solution {
    // Function to compute the total count of parts
    public int totalCount(int k, int[] arr) {
        // int n = arr.length;
        // int sum = 0;
        
        
        // for(int i = 0; i < n; i++){
        //     int count = 1;
        //     int element = arr[i];
            
        //     while(element > k){
        //         element = element - k;
        //         count++;
        //     }
            
        //     sum += count;
        // }
        
        // return sum;

        int total = 0;
        
        // Loop through each element in the array
        for (int num : arr) {
            // Add the count of parts required for each element
            total += (num + k - 1) / k;
        }
        
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of array
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        // Input the array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Input the threshold value k
        System.out.println("Enter the threshold value (k):");
        int k = sc.nextInt();
        
        // Create an instance of the solution
        Solution sol = new Solution();
        
        // Get the result
        int result = sol.totalCount(k, arr);
        
        // Output the result
        System.out.println("Total count of parts: " + result);
    }
}
