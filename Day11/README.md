# Facing the Sun 🌅

## Problem Statement

![Facing The Sun](https://media.geeksforgeeks.org/wp-content/uploads/Building.png)
Given an array `height` representing the heights of buildings, you have to count the buildings that will see the sunrise (Assume the sun rises on the side of the array starting point). A building can see the sunrise if its height is strictly greater than the heights of all the buildings to its left.

### Function Description

You need to implement the following function:

```java
class Solution {
    // Returns count of buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
    }
}

- The function countBuildings takes an array of integers as input and returns the count of buildings that can see the sunrise.
```

### **Input Format**

- An integer n, the number of buildings.
- An array height[] of size n representing the heights of the buildings.

### **Output Format**

- Return the count of buildings that can see the sunrise.

## 📊 Examples

### Example 1

#### Input:

```
height[] = [7, 4, 8, 2, 9]
```

**Output:**

```java
3
```

### Explanation:

- Building with height 7 can see the sunrise.
- Building with height 4 cannot see the sunrise as it is hidden by 7.
- Building with height 8 can see the sunrise as it is taller than 7.
- Building with height 2 cannot see the sunrise as it is shorter than 8.
- Building with height 9 can see the sunrise as it is taller than 8.

### Example 2

#### Input

```
height[] = [2, 3, 4, 5]
```

**Output:**

```java
4
```

#### Explanation:

All buildings can see the sunrise as they progressively increase in height.

## 🧠 Approach and Solution

1. Start by assuming the first building can always see the sunrise.
2. Iterate through the array and for each building, if it is taller than the maximum height encountered so far, increment the count.
3. Update the maximum height after considering each building.

# Time Complexity

O(n), where n is the number of buildings.

# Space Complexity

O(1), as we are using a constant amount of space.

# Contributions

Feel free to contribute by sharing your insights, optimizations, or any alternative approaches you have for solving this problem. Pull requests are welcome!

# Contact

For any questions or suggestions, please contact me
