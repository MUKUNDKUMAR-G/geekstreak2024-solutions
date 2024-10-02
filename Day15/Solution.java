import java.util.HashMap;
import java.util.Scanner;

class Solution {
    // Function to find the smallest window in the string s consisting
    // of all the characters of string p.
    public static String smallestWindow(String s, String p) {
        if (s.length() < p.length()) {
            return "-1";
        }
        
        // Frequency of characters in p
        HashMap<Character, Integer> pFreq = new HashMap<>();
        for (char ch : p.toCharArray()) {
            pFreq.put(ch, pFreq.getOrDefault(ch, 0) + 1);
        }

        // Sliding window variables
        HashMap<Character, Integer> windowFreq = new HashMap<>();
        int start = 0, minLen = Integer.MAX_VALUE, minStart = -1;
        int matchedChars = 0;

        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            windowFreq.put(endChar, windowFreq.getOrDefault(endChar, 0) + 1);

            if (pFreq.containsKey(endChar) && windowFreq.get(endChar) <= pFreq.get(endChar)) {
                matchedChars++;
            }

            while (matchedChars == p.length()) {
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                char startChar = s.charAt(start);
                windowFreq.put(startChar, windowFreq.get(startChar) - 1);
                if (pFreq.containsKey(startChar) && windowFreq.get(startChar) < pFreq.get(startChar)) {
                    matchedChars--;
                }
                start++;
            }
        }

        return minStart == -1 ? "-1" : s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s:");
        String s = sc.nextLine();
        System.out.println("Enter string p:");
        String p = sc.nextLine();

        String result = smallestWindow(s, p);
        System.out.println("Smallest window: " + result);
    }
}
