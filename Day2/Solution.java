import java.util.PriorityQueue;

class Solution {
    public long minCost(long[] arr) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (long length : arr) {
            minHeap.offer(length);
        }

        long totalCost = 0;
        while (minHeap.size() > 1) {
            long first = minHeap.poll();
            long second = minHeap.poll();
            long cost = first + second;
            totalCost += cost;
            minHeap.offer(cost);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        long[] arr1 = {4, 3, 2, 6};
        long[] arr2 = {4, 2, 7, 6, 9};

        System.out.println("Minimum cost to connect ropes (arr1): " + sol.minCost(arr1)); // Output: 29
        System.out.println("Minimum cost to connect ropes (arr2): " + sol.minCost(arr2)); // Output: 62
    }
}
