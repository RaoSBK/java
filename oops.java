// class Pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("Writing something ");
//     }
//     public void printColor(){
//         System.out.println(this.color);
//     }
// }


// class Student{
//     String name;
//     int age;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

//     // Student(String name, int age){
//     //     this.name = name;
//     //     this.age= age;
//     // }

//     Student(Student s2){
//         this.name = s2.name;
//         this.age = s2.age;
//     }

//     Student (){

//     }
// }

// public class oops{
//     public static void main(String args[]){


//         // Pen pen1 = new Pen();
//         // pen1.color = "Blue";
//         // pen1.type = "Fountain Pen";

//         // pen1.write();
//         // pen1.printColor();
//         // // System.out.println("Colour of the pen: "+pen1.color);
//         // // System.out.println("Type of the pen: "+pen1.type);

//         // Pen pen2 = new Pen();
//         // pen2.color= "Black";
//         // pen2.type = "gel";


//         // pen1.printColor();
//         // pen2.printColor();
//         // pen2.write();

//         // Student st1 = new Student("Suraj Bhan", 19);
//         // st1.printInfo();

//         Student st1 = new Student();
//         st1.name = "Suraj";
//         st1.age = 19;


//         Student s2 = new Student(st1);
//         s2.printInfo();

//     }
// }


//polymorphism 


// class Student{
//     String name;
//     int age;

//     public void printInfo(String name){
//         System.out.println(name);
//     }

//     public void printInfo(int age){
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age){
//         System.out.println(name+" "+ age);
//     }
// }

// public class oops{
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name = "Suraj Bhan";
//         s1.age = 19;
//         s1.printInfo(s1.name, s1.age);
        
//     }
// }


// Inheritance 

// class Shape {
//     String color;
//     int area;
// }

// class Triangle extends Shape{
//     public void area(int l, int b){
//         System.out.println((0.5)*l*b);
//     }
// }

// class Circle extends Shape{
//     public void area(int r){
//         System.out.println((3.14)*r*r);
//     }
// }

// public class oops{
//     public static void main(String args[]){
//         Triangle t1 = new Triangle();
//         t1.area(5, 4);


//         Circle c1 = new Circle();
//         c1.area(32);

        
//     }
// }


// single inhertitance 

// import java.util.Scanner;

// class Calculation{
//     int num1;
//     int num2;

//     public void input(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number: ");
//         this.num1 = sc.nextInt();

//         System.out.println("Enter the second number");
//         this.num2 = sc.nextInt();
//     }
    
// }

// class Sum extends Calculation{

//     public void result(){
//         int res = this.num1 + this.num2;
//         System.out.println(res);
//     }
// }

// class Subtraction extends Calculation{
//     public void result(){
//         int res = this.num1-this.num2;
//         System.out.println(res);
//     }
// }

// public class oops{
//     public static void main(String args[]){

//         Sum s1 = new Sum();
//         s1.input();
//         s1.result();
        

//         Subtraction s2 = new Subtraction();
//         s2.input();
//         s2.result();
//     }
// }


// WAP to demonstrate interface

// import java.util.Scanner;

// interface Add{
//     void sum (int a, int b);
// }

// class Calculation implements Add{

//     public void result(int a, int b){
//         int res = a+b;
//         System.out.println("Sum = "+ res);
//     }
// }

// public class oop{
//     public static void main(String args[]){
//         Add obj = new Calculation();
//         obj.result(5,4);
//     }
// }


// Step 1: Create Interface
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
// public class oops {
//     public static void main(String[] args) {

//         Add obj = new Calculation();   // Interface reference
//         obj.sum(10, 20);
//     }
// }




// //program to find out the area and perimeter of rectangle using Class, object methods

// class Rectangle{
//     double l,  b;
//     void perarea(){
//         System.out.println("perimeter "+ 2*(l+b));
//         System.out.println("Areas is "+ (l+b));
//     }
// }

// class oops{
//     public static void main(String args[]){
//         Rectangle rectnew = new Rectangle();

//         rectnew.l = 20;
//         rectnew.b = 30;
        
//         rectnew.perarea();
//     }
// }




// Method overloading 
class MethodOverload{
    static int addMethod(int n1, int n2){
        return n1+n2;
    }


    static double addMethod(double x, double y){
        return x+y;
    }


    public static void main(String args[]){
        int iobj = addMethod(11,22);
        double dobj = addMethod(5.23, 6.43);

        System.out.println("Interger value"+ iobj);
        System.out.println("float value"+ dobj);
    }
}
