// This file contains more comments line and more sections of the programs because these are revised parts


// // Write a Java program to demonstrate run-time polymorphism using classes where:

// class Animal{
//     void sound(){
//         System.out.println("Animal does sound");
//     }
// }

// class Dog extends Animal{
//     @Override
//     void sound(){
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal{
//     @Override
//     void sound(){
//         System.out.println("Car meows");
//     }
// }

// public class revise1{
//     public static void main(String[] args){
//         Animal a;
//         a = new Dog();
//         a.sound();
//         a = new Cat();
//         a.sound();

//         a = new Animal();
//         a.sound();
//     }
// }


// // Q2 Write a Java program using abstract class to perform:
// abstract class Shape{
//     abstract void draw();
//     void display(){
//         System.out.println("Displaying the shape");
//     }
// }

// class Circle extends Shape{
//     @Override
//     void draw(){
//         System.out.println("Drawing a Cricle");
//     }
// }

// class Rectangle extends Shape{
//     @Override
//     void draw(){
//         System.out.println("Drawing a Triangle");
//     }
// }

// class Triangle extends Shape{
//     @Override
//     void draw(){
//         System.out.println("Drawind a Triangle");
//     }
// }

// public class revise1{
//     public static void main(String[] args){
//         Shape s;

//         s= new Circle();
//         s.draw();
//         s.display();

//         s= new Rectangle();
//         s.draw();
//         s.display();

//         s = new Triangle();
//         s.draw();
//         s.display();
//     }
// }


// Write a Java program to: ,Take n elements in an array, Find sum of even numbers, Also count how many even numbers are present
// Ans:- 
// import java.util.Scanner;

// public class revise1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of elements: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         int sum = 0;
//         int count = 0;

//         System.out.println("Enter "+ n + "Elements: ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//             if(arr[i] %2 == 0){
//                 sum += arr[i];
//                 count++;
//             }
//         }

//         System.out.println("Sum of even numbers: "+ sum);
//         System.out.println("Count of even numbers: "+ count);

//         sc.close();
//     }
// }

// Write a Java program to implement compile-time polymorphism using interface.
// Requirements:
// Create interface Operation
// Declare method sum()
// Overload method sum(int, int) and sum(double, double)
// Create class Calculation that implements interface
// Call both methods in main()

// interface Operation{
//     void sum(int a, int b);
//     void sum(double a, double b);
// }

// class Calculation implements Operation{
//     public void sum(int a, int b){
//         int result = a+b;
//         System.out.println("Sum of integers: "+ result);
//     }

//     public void sum(double a, double b){
//         double result = a+b;
//         System.out.println("Sum of doubles: "+result);
//     }
// }

// public class revise1{
//     public static void main(String[] args){
//         Calculation calc = new Calculation();
        
//         calc.sum(10, 20);
//         calc.sum(15.5, 24.5);
//     }
// }


// ✅ Question 5 — Switch + Loop + Factorial

// Write a Java program that:

// Shows menu using switch
// User chooses option
// Perform operations:

// 1 → Factorial
// 2 → Sum of natural numbers
// 3 → Even numbers sum in array
// 4 → Exit

// Ans


// import java.util.Scanner;

// public class MenuProgram {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int choice;

//         do {
//             System.out.println("\n--- Menu ---");
//             System.out.println("1. Factorial");
//             System.out.println("2. Sum of natural numbers");
//             System.out.println("3. Even numbers sum in array");
//             System.out.println("4. Exit");
//             System.out.print("Enter your choice: ");
//             choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter a number: ");
//                     int num = sc.nextInt();
//                     long fact = 1;
//                     for (int i = 1; i <= num; i++) {
//                         fact *= i;
//                     }
//                     System.out.println("Factorial of " + num + " = " + fact);
//                     break;

//                 case 2:
//                     System.out.print("Enter n: ");
//                     int n = sc.nextInt();
//                     int sum = 0;
//                     for (int i = 1; i <= n; i++) {
//                         sum += i;
//                     }
//                     System.out.println("Sum of first " + n + " natural numbers = " + sum);
//                     break;

//                 case 3:
//                     System.out.print("Enter size of array: ");
//                     int size = sc.nextInt();
//                     int[] arr = new int[size];
//                     System.out.println("Enter " + size + " elements:");
//                     for (int i = 0; i < size; i++) {
//                         arr[i] = sc.nextInt();
//                     }
//                     int evenSum = 0;
//                     for (int val : arr) {
//                         if (val % 2 == 0) {
//                             evenSum += val;
//                         }
//                     }
//                     System.out.println("Sum of even numbers in array = " + evenSum);
//                     break;

//                 case 4:
//                     System.out.println("Exiting program...");
//                     break;

//                 default:
//                     System.out.println("Invalid choice! Please try again.");
//             }
//         } while (choice != 4);

//         sc.close();
//     }
// }


// Question 6 — Runtime Polymorphism + Abstract Class + Arithmetic

// Write a Java program where:

// Create an abstract class Operation
// Declare abstract method calculate(int a, int b)
// Create two subclasses:
// Add
// Multiply
// Override method in both classes
// Use parent class reference to call methods (runtime polymorphism)
// Take input using Scanner


//Ans:-

// import java.util.Scanner;

// // Abstract class
// abstract class Operation {
//     // Abstract method
//     abstract int calculate(int a, int b);
// }

// // Subclass for Addition
// class Add extends Operation {
//     @Override
//     int calculate(int a, int b) {
//         return a + b;
//     }
// }

// // Subclass for Multiplication
// class Multiply extends Operation {
//     @Override
//     int calculate(int a, int b) {
//         return a * b;
//     }
// }

// public class revise1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         System.out.println("\nChoose operation:");
//         System.out.println("1. Addition");
//         System.out.println("2. Multiplication");
//         int choice = sc.nextInt();

//         // Parent class reference
//         Operation op;

//         switch (choice) {
//             case 1:
//                 op = new Add(); // runtime polymorphism
//                 System.out.println("Result = " + op.calculate(a, b));
//                 break;

//             case 2:
//                 op = new Multiply(); // runtime polymorphism
//                 System.out.println("Result = " + op.calculate(a, b));
//                 break;

//             default:
//                 System.out.println("Invalid choice!");
//         }

//         sc.close();
//     }
// }


// Runtime Polymorphism + Abstract Class + Arithmetic

// Write a Java program where:

// Create an abstract class Operation
// Declare abstract method calculate(int a, int b)
// Create two subclasses:
// Add
// Multiply
// Override method in both classes
// Use parent class reference to call methods (runtime polymorphism)
// Take input using Scanner


// import java.util.Scanner;

// // Abstract class
// abstract class Operation {
//     // Abstract method
//     abstract int calculate(int a, int b);
// }

// // Subclass for Addition
// class Add extends Operation {
//     @Override
//     int calculate(int a, int b) {
//         return a + b;
//     }
// }

// // Subclass for Multiplication
// class Multiply extends Operation {
//     @Override
//     int calculate(int a, int b) {
//         return a * b;
//     }
// }

// public class revise1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Taking input
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         // Runtime polymorphism: parent reference, child object
//         Operation op;

//         // Addition
//         op = new Add();
//         System.out.println("Addition: " + op.calculate(a, b));

//         // Multiplication
//         op = new Multiply();
//         System.out.println("Multiplication: " + op.calculate(a, b));

//         sc.close();
//     }
// }


// ✅ Question 7 — Array + Interface + Even/Odd Sum

// Write a Java program using interface where:

// Interface ArrayOperation
// Method → process(int arr[])
// Class EvenSum → sum of even numbers
// Class OddSum → sum of odd numbers
// Take array input from user
// Call both operations


// import java.util.Scanner;

// // Interface
// interface ArrayOperation {
//     int process(int arr[]);
// }

// // Class to calculate sum of even numbers
// class EvenSum implements ArrayOperation {
//     @Override
//     public int process(int arr[]) {
//         int sum = 0;
//         for (int num : arr) {
//             if (num % 2 == 0) {
//                 sum += num;
//             }
//         }
//         return sum;
//     }
// }

// // Class to calculate sum of odd numbers
// class OddSum implements ArrayOperation {
//     @Override
//     public int process(int arr[]) {
//         int sum = 0;
//         for (int num : arr) {
//             if (num % 2 != 0) {
//                 sum += num;
//             }
//         }
//         return sum;
//     }
// }

// public class revise1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Taking array input
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter " + n + " elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Using interface reference for runtime polymorphism
//         ArrayOperation op;

//         // Even sum
//         op = new EvenSum();
//         System.out.println("Sum of even numbers: " + op.process(arr));

//         // Odd sum
//         op = new OddSum();
//         System.out.println("Sum of odd numbers: " + op.process(arr));

//         sc.close();
//     }
// }

//Menu Driven Program using Abstract Class







// Write a Java program that:

// Create abstract class Operation
// Declare abstract method calculate(int a, int b)
// Create subclasses:
// Add
// Sub
// Mul
// Div
// Use switch + do-while loop
// User selects operation from menu
// Use runtime polymorphism


// import java.util.Scanner;


// abstract class Operation {
//     public abstract int calculate(int a, int b);
// }


// class Add extends Operation {
//     public int calculate(int a, int b) {
//         return a + b;
//     }
// }

// class Sub extends Operation {
//     public int calculate(int a, int b) {
//         return a - b;
//     }
// }

// class Mul extends Operation {
//     public int calculate(int a, int b) {
//         return a * b;
//     }
// }

// class Div extends Operation {
//     public int calculate(int a, int b) {
//         if (b == 0) {
//             System.out.println("Division by zero is not allowed!");
//             return 0;
//         }
//         return a / b;
//     }
// }


// public class revise1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Operation op;  

//         int choice;
//         do {
//             System.out.println("\n--- Menu ---");
//             System.out.println("1. Addition");
//             System.out.println("2. Subtraction");
//             System.out.println("3. Multiplication");
//             System.out.println("4. Division");
//             System.out.println("5. Exit");
//             System.out.print("Enter your choice: ");
//             choice = sc.nextInt();

//             if (choice >= 1 && choice <= 4) {
//                 System.out.print("Enter first number: ");
//                 int a = sc.nextInt();
//                 System.out.print("Enter second number: ");
//                 int b = sc.nextInt();

//                 switch (choice) {
//                     case 1:
//                         op = new Add();
//                         break;
//                     case 2:
//                         op = new Sub();
//                         break;
//                     case 3:
//                         op = new Mul();
//                         break;
//                     case 4:
//                         op = new Div();
//                         break;
//                     default:
//                         op = null;
//                 }

//                 if (op != null) {
//                     int result = op.calculate(a, b);
//                     System.out.println("Result: " + result);
//                 }
//             } else if (choice != 5) {
//                 System.out.println("Invalid choice! Please try again.");
//             }

//         } while (choice != 5);

//         System.out.println("Program terminated.");
//         sc.close();
//     }
// }






// Interface + Array + Compile Time Polymorphism

// Write a Java program where:

// Create interface Calculator
// Declare method sum()
// Overload methods:
// sum(int a, int b)
// sum(int arr[])
// Create class Result that implements interface
// Take array input from user
// Show:
// sum of two numbers
// sum of array elements




import java.util.Scanner;


interface Calculator {
    int sum(int a, int b);       
    int sum(int arr[]);
}


class Result implements Calculator {
    
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int arr[]) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
}



public class revise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum of two numbers: " + r.sum(a, b));

        
        System.out.print("\nEnter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of array elements: " + r.sum(arr));

        sc.close();
    }
}