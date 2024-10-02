import java.util.Scanner;

class Solution {
    // Function to find the length of the longest proper prefix which is also a proper suffix
    int lps(String str) {
        int n = str.length();
        int[] lps = new int[n]; // Array to store LPS values
        int length = 0; // Length of the previous longest prefix suffix
        int i = 1;

        // Build the LPS array
        while (i < n) {
            if (str.charAt(i) == str.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps[n - 1]; // The last value of the LPS array gives the length of the longest proper prefix-suffix
    }

    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Solution sol = new Solution();
        int result = sol.lps(str);
        System.out.println("The length of the longest proper prefix which is also a proper suffix: " + result);
    }
}
