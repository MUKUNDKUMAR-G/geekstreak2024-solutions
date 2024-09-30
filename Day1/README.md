# Chaining Strings to Form a Circle 🔗

## Problem Statement

Given an array `arr` of lowercase strings, determine if the strings can be chained together to form a circle. A string **X** can be chained together with another string **Y** if the last character of **X** is the same as the first character of **Y**. If every string of the array can be chained with exactly two strings of the array (one with the first character and the second with the last character of the string), it will form a circle.

### Example

For the array `arr[] = {"for", "geek", "rig", "kaf"}`, the answer will be **Yes** as the given strings can be chained as "for", "rig", "geek", and "kaf".

## Function Description

You need to implement the following function:

```java
boolean canFormCircle(String[] arr);
```

### **Input Format**

- An integer n representing the number of strings.
- An array arr[] of n strings, each string consists of lowercase letters.

### **Output Format**

- Return 1 if the strings can form a circle, otherwise return 0.

## 📊 Examples

### Example 1

#### Input:

```
arr[] = ["abc", "bcd", "cdf"]

```

**Output:**

```java
0
```

### Explanation:

These strings can't form a circle because no string starts with 'd'.

### Example 2

#### Input

```
["ab", "bc", "cd", "da"]

```

**Output:**

```java
1
```

#### Explanation:

The strings can form a circle as "ab" -> "bc" -> "cd" -> "da".

## 🧠 Approach and Solution

- **In-degree and Out-degree Matching:** Check if for every character, the number of strings starting with that character matches the number of strings ending with it.
- **Graph Connectivity:** Build a graph with the first and last characters of the strings and check if all nodes with non-zero degrees form a strongly connected component.
- **Eulerian Circuit:** Verify if the graph has an Eulerian circuit, where in-degrees match out-degrees and the graph is strongly connected.

# Time Complexity

O(n) for iterating through the strings.

# Space Complexity

O(n) for storing in-degrees and out-degrees.

# Contributions

Feel free to contribute by sharing your insights, optimizations, or any alternative approaches you have for solving this problem. Pull requests are welcome!

# Contact

For any questions or suggestions, please contact me
