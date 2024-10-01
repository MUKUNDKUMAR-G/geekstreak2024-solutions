import java.util.Scanner;
import java.util.Stack;

class Solution {
    // Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();

        for (char ch : x.toCharArray()) {
            // Push opening brackets into stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // Check if stack is empty (invalid) or mismatch
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // Return true if the stack is empty (balanced)
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String expression = sc.nextLine();

        if (ispar(expression)) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }
}
