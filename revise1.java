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

interface Operation{
    void sum(int a, int b);
    void sum(double a, double b);
}

class Calculation implements Operation{
    public void sum(int a, int b){
        int result = a+b;
        System.out.println("Sum of integers: "+ result);
    }

    public void sum(double a, double b){
        double result = a+b;
        System.out.println("Sum of doubles: "+result);
    }
}

public class revise1{
    public static void main(String[] args){
        Calculation calc = new Calculation();
        
        calc.sum(10, 20);
        calc.sum(15.5, 24.5);
    }
}