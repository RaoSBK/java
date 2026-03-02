import java.util.Scanner;

public class SecondLargestFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num != largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        int count = 0;
        StringBuilder locations = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (arr[i] == secondLargest) {
                count++;
                locations.append(i).append(" "); // store index
            }
        }

        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("Second largest number: " + secondLargest);
            System.out.println("It appears " + count + " times.");
            System.out.println("Locations (index): " + locations.toString());
        }

        sc.close();
    }
}