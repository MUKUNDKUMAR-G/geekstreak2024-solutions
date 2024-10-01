# Longest Valid Parentheses 🥇

## Problem Statement

Given a string `str` consisting of opening and closing parentheses '(' and ')', find the length of the longest valid parenthesis substring.

A parenthesis string is valid if:

- For every opening parenthesis, there is a corresponding closing parenthesis.
- Opening parentheses must be closed in the correct order.

### Function Description

You need to implement the following function:

```java
class Solution {
    static int maxLength(String S) {
        // code here
    }
}
```

### **Input Format**

- A string S consisting of '(' and ')' (1 ≤ |S| ≤ 10^5).

### **Output Format**

- Return the length of the longest valid parenthesis substring.

## 📊 Examples

### Example 1

#### Input:

```
str = )()())
```

**Output:**

```java
4
```

### Explanation:

![Example 1](Example%201.jpg)
The longest valid parenthesis substring is "()()".

### Example 2

#### Input

```
str = ((()
```

**Output:**

```java
2
```

#### Explanation:

Explanation: The longest valid parenthesis substring is ().

## 🧠 Approach and Solution

1. Use a stack to store the index of unmatched parentheses.
2. Start with a base index of -1 in the stack to handle valid substrings at the beginning.
3. Traverse the string:
   - If (, push the index onto the stack.
   - If ), pop the top of the stack and calculate the length of the current valid substring by comparing it to the top index in the stack.
4. If the stack is empty after popping, push the current index as a new base.
5. Track and return the maximum length of valid substrings.

# Time Complexity

O(n), where n is the length of the string.

# Space Complexity

O(n) for the stack used in the algorithm.

# Contributions

Feel free to contribute by sharing your insights, optimizations, or any alternative approaches you have for solving this problem. Pull requests are welcome!

# Contact

For any questions or suggestions, please contact me
