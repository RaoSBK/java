// Write a java program to sort the element, accept input at runtime 

// import java.util.Scanner;
// class main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);
//         int arr[] = new int[5];
//         int i, j, t;

//         System.out.println("Enter the element of the array");
//         for(i=0; i<5; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Array elements are: ");
//         for(i=0; i<5; i++){
//             System.out.println(arr[i]+"\n");
//         }

//         System.out.println("Sorting array elements are: ");
//         for(i=0; i<5; i++){
//             for(j=i+1; j<5;j++){
//                 if (arr[i] > arr[j]){
//                     t = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = t;
//                 }
//             }
//         }

//         System.out.println("Sorted elements are: ");
//         for(i=0; i<5; i++){
//             System.out.println(arr[i]+"\n");
//         }
//     }
// }


// Java program demonstrating a search elemnet in an array

import java.util.Scanner;

public class revise2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Entered elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        // Sorting
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }

        System.out.println("Sorted elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        // Searching
        System.out.println("Enter the element you want to search:");
        int search = sc.nextInt();

        int first = 0;
        int last = n - 1;
        boolean found = false;

        while (first <= last) {
            int middle = (first + last) / 2;

            if (array[middle] < search) {
                first = middle + 1;
            } else if (array[middle] == search) {
                System.out.println(search + " found at index " + middle);
                found = true;
                break;
            } else {
                last = middle - 1;
            }
        }

        if (!found) {
            System.out.println(search + " is not found in the list");
        }

        sc.close();
    }
}
