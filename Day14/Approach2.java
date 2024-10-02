import java.util.Scanner;

class Approach2 {
    // Function to find the missing and repeating number
    int[] findTwoElement(int arr[], int n) {
        long sumN = (long) n * (n + 1) / 2;
        long sumSqN = (long) n * (n + 1) * (2 * n + 1) / 6;

        long sum = 0, sumSq = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            sumSq += (long) arr[i] * arr[i];
        }

        long diff = sumN - sum; // missing - repeating
        long sqDiff = sumSqN - sumSq; // missing^2 - repeating^2

        long sumDiff = sqDiff / diff; // (missing + repeating)

        int missing = (int) (diff + sumDiff) / 2;
        int repeating = (int) (sumDiff - missing);

        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solve sol = new Solve();
        int result[] = sol.findTwoElement(arr, n);
        System.out.println("Repeating number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }
}
