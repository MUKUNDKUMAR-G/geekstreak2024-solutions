import java.util.Scanner;
import java.util.Stack;

class Solution {
    static int maxLength(String S) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base index for valid substrings
        int maxLength = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push(i); // Push index of '('
            } else {
                stack.pop(); // Pop for ')'
                if (!stack.isEmpty()) {
                    maxLength = Math.max(maxLength, i - stack.peek());
                } else {
                    stack.push(i); // Update base index for future valid substrings
                }
            }
        }
        return maxLength;
    }

    // Prompting user for input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string containing parentheses:");
        String input = sc.nextLine();
        System.out.println("The length of the longest valid parentheses substring is: " + maxLength(input));
    }
}
