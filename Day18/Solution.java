import java.util.*;

class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        // int n = arr.length;
        // ArrayList<Integer> result = new ArrayList<>();
        
        // for(int i = 0; i <= n - k; i++){
        //     int sum = 0;
            
        //     for(int j = 0; j < k; j++){
        //         sum = Math.max(sum, arr[j + i]);
        //     }
            
        //     result.add(sum);
        // }
        
        // return result;


        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < arr.length; i++) {
            // Remove elements from the front of the deque that are out of the window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            
            // Remove elements from the back of the deque that are smaller than the current element
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            
            // Add the current element at the back of the deque
            deque.addLast(i);
            
            // The front of the deque is the maximum of the current window
            if (i >= k - 1) {
                result.add(arr[deque.peekFirst()]);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // User input prompt
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the size of subarrays (k):");
        int k = sc.nextInt();
        
        Solution sol = new Solution();
        ArrayList<Integer> result = sol.max_of_subarrays(arr, k);
        
        System.out.println("Maximum values of each subarray of size " + k + ": " + result);
    }
}
