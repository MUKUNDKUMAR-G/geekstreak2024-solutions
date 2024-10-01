import java.util.Scanner;

class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // Split the string into words using '.' as the delimiter
        String[] splitedString = str.split("[\\.]");
        int n = splitedString.length;
        str = "";
        
        for(int i = n - 1; i >= 0; i--){
            
            if(i != 0 ){
                str += splitedString[i] + ".";
            } else{
                str += splitedString[i];
            }
        }
        
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();

        Solution solution = new Solution();
        String result = solution.reverseWords(input);

        System.out.println(result);
    }
}
