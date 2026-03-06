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
// import java.util.Scanner;

// public class SecondLargestFinder {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of elements in the array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " numbers:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int largest = arr[0];
//         for (int num : arr) {
//             if (num > largest) {
//                 largest = num;
//             }
//         }

//         int secondLargest = Integer.MIN_VALUE;
//         for (int num : arr) {
//             if (num != largest && num > secondLargest) {
//                 secondLargest = num;
//             }
//         }

//         int count = 0;
//         StringBuilder locations = new StringBuilder();
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == secondLargest) {
//                 count++;
//                 locations.append(i).append(" "); // store index
//             }
//         }

        
//         if (secondLargest == Integer.MIN_VALUE) {
//             System.out.println("No second largest number found.");
//         } else {
//             System.out.println("Second largest number: " + secondLargest);
//             System.out.println("It appears " + count + " times.");
//             System.out.println("Locations (index): " + locations.toString());
//         }

//         sc.close();
//     }
// }



import java.util.Scanner;

public class tryCatchFinally{
    public static void main(String args[]){
        
        try{
            
            Scanner sc = new Scanner(System.in);
            int num1=0;
            int num2=0;
            int n;

            n=0;
            while (n < 3){

                System.out.println("Enter the first number which is an even number");
                num1 = sc.nextInt();
                if(num1 % 2 == 0){
                    System.out.println("Your enterd input is "+num1);
                    break;
                } else {
                    
                    if(n<3){
                        System.out.println("Try to enter even number only");
                    } else {
                        System.out.println("Too many wrong attempts are enterd ");
                        return;
                    }
                    
                }
                n++;
            }

            n=0;
            while(n<3){
                System.out.println("Enter the second number which is an odd number");
                num2 = sc.nextInt();
                if(num2 % 2 != 0){
                    System.out.println("Your input is "+ num2);
                    break;
                } else {
                    n++;
                    if(n<3){
                        System.out.println("Try again, Enter an odd number");
                    } else {
                        System.out.println("Too many wrong attempts");
                    }
                }
            }
            

            int result = num1/num2;
            System.out.println("Result: "+result);
            sc.close();

        } catch (ArithmeticException e){
            System.out.println("An Exception occured"+e.getMessage());
        } finally {
            System.out.println("The finally block is always executed");
        }

        System.out.println("Program continues after the try-catch-finally block.");
    }
}