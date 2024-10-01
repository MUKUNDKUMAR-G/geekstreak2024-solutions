# Parenthesis Checker ✅

## Problem Statement

Given an expression string `x`, examine whether the pairs and the orders of `{}`, `()`, and `[]` are correct in the expression. The function should return `true` if the parentheses are balanced and `false` otherwise.

### Function Description

You need to implement the following function:

```java
class Solution {
    // Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        // add your code here
    }
}

- Takes a string x as input.
- Returns true if the parentheses are balanced, otherwise false.
```

### **Input Format**

- A string x containing parentheses: {, }, [, ], (, and ).

### **Output Format**

- A boolean value (true or false). The driver code prints "balanced" if the function returns true, otherwise it prints "not balanced".

## 📊 Examples

### Example 1

#### Input:

```
x = {([])}
```

**Output:**

```java
true
```

### Explanation:

The string contains balanced parentheses with matching pairs and correct order.

### Example 2

#### Input

```
x = ()
```

**Output:**

```java
true
```

#### Explanation:

Single pair of parentheses is balanced.

### Example 3

#### Input

```
x = ([]
```

**Output:**

```java
false
```

#### Explanation:

Opening brackets are not properly closed, making the expression unbalanced.

## 🧠 Approach and Solution

1. Use a stack to track the opening parentheses.
2. Iterate through the string, pushing opening brackets into the stack.
   - For closing brackets, pop the stack and check if the popped bracket matches the expected opening bracket.

- At the end, the stack should be empty if the parentheses are balanced.

# Time Complexity

O(|x|), where |x| is the length of the string.

# Space Complexity

O(|x|) for the stack used in the algorithm.

# Contributions

Feel free to contribute by sharing your insights, optimizations, or any alternative approaches you have for solving this problem. Pull requests are welcome!

# Contact

For any questions or suggestions, please contact me
