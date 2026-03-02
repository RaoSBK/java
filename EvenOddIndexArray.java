import java.util.Scanner;

public class EvenOddIndexArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter a number for index " + i + ": ");
                int num = sc.nextInt();

                if (i % 2 == 0 && num % 2 == 0) {
                    arr[i] = num;
                    break; 
                }

                else if (i % 2 != 0 && num % 2 != 0) {
                    arr[i] = num;
                    break;
                } else {
                    System.out.println("Invalid input! " +
                            "At index " + i + " you must enter " +
                            (i % 2 == 0 ? "an EVEN number." : "an ODD number."));
                }
            }
        }

        
        System.out.println("Final array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + i + " -> " + arr[i]);
        }

        sc.close();
    }
}