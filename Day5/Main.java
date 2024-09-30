import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }
        
        int i = 0, j = 0, k = 0;
        boolean addPositive = true;
        
        while (i < positive.size() && j < negative.size()) {
            if (addPositive) {
                arr.set(k++, positive.get(i++));
            } else {
                arr.set(k++, negative.get(j++));
            }
            addPositive = !addPositive;
        }
        
        while (i < positive.size()) {
            arr.set(k++, positive.get(i++));
        }
        
        while (j < negative.size()) {
            arr.set(k++, negative.get(j++));
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        Solution sol = new Solution();
        sol.rearrange(arr);
        System.out.println(arr); // Output the rearranged array
        scanner.close();
    }
}
