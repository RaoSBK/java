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

import java.util.Scanner;

// Abstract class
abstract class Operation {
    // Abstract method
    abstract int calculate(int a, int b);
}

// Subclass for Addition
class Add extends Operation {
    @Override
    int calculate(int a, int b) {
        return a + b;
    }
}

// Subclass for Multiplication
class Multiply extends Operation {
    @Override
    int calculate(int a, int b) {
        return a * b;
    }
}

public class revise1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\nChoose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        int choice = sc.nextInt();

        // Parent class reference
        Operation op;

        switch (choice) {
            case 1:
                op = new Add(); // runtime polymorphism
                System.out.println("Result = " + op.calculate(a, b));
                break;

            case 2:
                op = new Multiply(); // runtime polymorphism
                System.out.println("Result = " + op.calculate(a, b));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}