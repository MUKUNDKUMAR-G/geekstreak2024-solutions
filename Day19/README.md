# Minimal Cost 💰

## Problem Statement

There is an array `arr` of heights of stones, and Geek is standing at the first stone. Geek can jump to one of the following stones: `i+1`, `i+2`, ... `i+k`, where `k` is the maximum number of steps that can be jumped. The cost incurred for jumping to stone `j` is given by `|hi - hj|`, where `hi` is the height of the current stone and `hj` is the height of the stone to which Geek jumps. Your task is to find the minimum possible total cost incurred before Geek reaches the last stone.

### Function Description

You need to implement the following function:

```java
class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
    }
}
Function Name: minimizeCost
Input:
k - maximum number of steps Geek can jump.
arr - array of integers representing the heights of the stones.
Output: Integer representing the minimum cost incurred to reach the last stone.
```

### **Input Format**

- Integer k, and an array arr[] of stone heights.

### **Output Format**

- A single integer, the minimum cost.

## 📊 Examples

### Example 1

#### Input:

```
k = 3, arr[] = [10, 30, 40, 50, 20]
```

**Output:**

```java
30
```

### Explanation:

Geek jumps from 1 -> 2 -> 5, with a total cost of |10-30| + |30-20| = 30.

### Example 2

#### Input

```
k = 1, arr[] = [10, 20, 10]
```

**Output:**

```java
20
```

#### Explanation:

Geek jumps from 1 -> 2 -> 3, with a total cost of |10-20| + |20-10| = 20.

## 🧠 Approach

1. **Understand the Problem**

   - We have an array of stone heights.
   - We can jump from 1 to k stones ahead.
   - The cost of a jump is the absolute difference in heights.
   - We need to find the minimum total cost to reach the last stone.

2. **Recognize the Dynamic Programming Opportunity**

   - The problem exhibits optimal substructure: the optimal solution can be constructed from optimal solutions of its subproblems.
   - There are overlapping subproblems: the same subproblems are solved multiple times.

3. **Define the DP State**

   - Let dp[i] represent the minimum cost to reach the i-th stone.

4. **Formulate the Recurrence Relation**

   - For each stone i, we can jump from any of the previous k stones.
   - dp[i] = min(dp[j] + |arr[i] - arr[j]|) for all j where i-k <= j < i

5. **Determine the Base Case**

   - dp[0] = 0 (cost to reach the first stone is 0)

6. **Decide the Iteration Order**

   - We need to fill the dp array from left to right.
   - For each position, we look back up to k steps.

7. **Implement the Solution**

   - Initialize the dp array with dp[0] = 0 and others as infinity.
   - Iterate through the array from index 1 to n-1.
   - For each index i, look back up to k steps and update dp[i].

8. **Handle Edge Cases**

   - Ensure we don't go out of bounds when looking back k steps.

9. **Optimize if Necessary**

   - The current approach is already optimal in terms of time complexity O(n\*k).
   - Space optimization is possible but may complicate the code.

10. **Return the Result**
    - The final answer is in dp[n-1], where n is the length of the array.

# Time Complexity

O(n \* k), where n is the number of stones.

# Space Complexity

O(n) for storing the DP array.

# Contributions

Feel free to contribute by sharing your insights, optimizations, or any alternative approaches you have for solving this problem. Pull requests are welcome!

# Contact

For any questions or suggestions, please contact me
