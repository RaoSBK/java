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


// Q2 Write a Java program using abstract class to perform:
abstract class Shape{
    abstract void draw();
    void display(){
        System.out.println("Displaying the shape");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a Cricle");
    }
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a Triangle");
    }
}

class Triangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawind a Triangle");
    }
}

public class revise1{
    public static void main(String[] args){
        Shape s;

        s= new Circle();
        s.draw();
        s.display();

        s= new Rectangle();
        s.draw();
        s.display();

        s = new Triangle();
        s.draw();
        s.display();
    }
}