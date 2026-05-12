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



// import java.util.Scanner;

// public class tryCatchFinally{
//     public static void main(String args[]){
        
//         try{
            
//             Scanner sc = new Scanner(System.in);
//             int num1=0;
//             int num2=0;
//             int n;

//             n=0;
//             while (n < 3){

//                 System.out.println("Enter the first number which is an even number");
//                 num1 = sc.nextInt();
//                 if(num1 % 2 == 0){
//                     System.out.println("Your enterd input is "+num1);
//                     break;
//                 } else {
                    
//                     if(n<3){
//                         System.out.println("Try to enter even number only");
//                     } else {
//                         System.out.println("Too many wrong attempts are enterd ");
//                         return;
//                     }
                    
//                 }
//                 n++;
//             }

//             n=0;
//             while(n<3){
//                 System.out.println("Enter the second number which is an odd number");
//                 num2 = sc.nextInt();
//                 if(num2 % 2 != 0){
//                     System.out.println("Your input is "+ num2);
//                     break;
//                 } else {
//                     n++;
//                     if(n<3){
//                         System.out.println("Try again, Enter an odd number");
//                     } else {
//                         System.out.println("Too many wrong attempts");
//                     }
//                 }
//             }
            

//             int result = num1/num2;
//             System.out.println("Result: "+result);
//             sc.close();

//         } catch (ArithmeticException e){
//             System.out.println("An Exception occured"+e.getMessage());
//         } finally {
//             System.out.println("The finally block is always executed");
//         }

//         System.out.println("Program continues after the try-catch-finally block.");
//     }
// }



// // Step 1: Create Interface
// interface Add {
//     void sum(int a, int b);
// }

// // Step 2: Implement Interface
// class Calculation implements Add {

//     public void sum(int a, int b) {
//         int result = a + b;
//         System.out.println("Sum = " + result);
//     }
// }

// // Step 3: Main Class
// public class exam {
//     public static void main(String[] args) {

//         Add obj = new Calculation();   // Interface reference
//         obj.sum(10, 20);
//     }
// }


// Write a program to perform run time polymorphism 


// class Animal{
//     void sound (){
//         System.out.println("Animal make sounds");
//     }
// }


// class Dog extends Animal {
//     void sound(){
//         System.out.println("Dog barks");
//     }
// }



// class cat extends Animal{
//     void sound(){
//         System.out.println("Cat meows");
//     }
// }


// class exam{
//     public static void main(String args[]){

//         Animal obj;

//         obj = new Dog();
//         obj.sound();

//         obj = new cat();
//         obj.sound();
//     }
// }


// Write a program to implement sum of even numbers in the given array list

// import java.util.Scanner;

// class sumOfEvenNums {

//     int sum = 0;

//     void findSum(int arr[], int n) {

//         for (int i = 0; i < n; i++) {

//             if (arr[i] % 2 == 0) {

//                 sum = sum + arr[i];
//             }
//         }

//         System.out.println("Sum of even numbers = " + sum);
//     }
// }

// class exam {

//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the array size: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter array elements:");

//         for (int i = 0; i < n; i++) {

//             arr[i] = sc.nextInt();
//         }

//         sumOfEvenNums obj = new sumOfEvenNums();

//         obj.findSum(arr, n);
//     }
// }






// Write a program to implement arithmatic operation using abstract class

import java.util.Scanner;

abstract class Arithmetic {

    int a, b;

    abstract void add();

    abstract void sub();

    abstract void mul();

    abstract void div();
}
class Calculate extends Arithmetic {

    void add() {
        System.out.println("Addition = " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction = " + (a - b));
    }

    void mul() {
        System.out.println("Multiplication = " + (a * b));
    }

    void div() {

        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Division by zero not possible");
    }
}



class exam {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Calculate obj = new Calculate();

        System.out.println("Enter two numbers:");

        obj.a = sc.nextInt();
        obj.b = sc.nextInt();

        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}