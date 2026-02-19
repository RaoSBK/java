class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something ");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}


class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student(String name, int age){
    //     this.name = name;
    //     this.age= age;
    // }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    Student (){
        
    }
}

public class oops{
    public static void main(String args[]){


        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "Fountain Pen";

        // pen1.write();
        // pen1.printColor();
        // // System.out.println("Colour of the pen: "+pen1.color);
        // // System.out.println("Type of the pen: "+pen1.type);

        // Pen pen2 = new Pen();
        // pen2.color= "Black";
        // pen2.type = "gel";


        // pen1.printColor();
        // pen2.printColor();
        // pen2.write();

        // Student st1 = new Student("Suraj Bhan", 19);
        // st1.printInfo();

        Student st1 = new Student();
        st1.name = "Suraj";
        st1.age = 19;


        Student s2 = new Student(st1);
        s2.printInfo();

    }
}