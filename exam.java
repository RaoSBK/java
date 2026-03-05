// import java.io.*;
// import java.util.Scanner;

// class exam {
//     int a, sum=0;
//     int a[n];
//     Scanner sc = new Scanner (System.in);
//     System.out.println("Enter the value of the terms:");
//     n = sc.nextInt();

//     System.out.println("Eneter the elements of an array");
//     while 

//     class  e_sum{

//     }
// }


// //Revision of multi_exception java
// public class Mul_exception{
//     public static void main(String[] args){
//         int  result;

//         try{
//             int[] arr= {1,2,3,4,5};
//             System.out.println(arr[1]);
//             result  = 10/0;
//             System.out.println(result);
//         } catch (ArrayIndexOutOfBoundsException e){
//             System.out.println("Array index is not found");
//         } catch (ArithmeticException e){
//             System.out.println("Cannot divide by zero");
//         } catch (Exception e){
//             System.out.println("Somthing else was happened "+ e.getMessage());
//         }
//     }
// }



// Finding the second largest number 
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