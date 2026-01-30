// class Super1 {
//     int a, b, c;

//     Super1() {
//         a = 10;
//         b = 20;
//     }

//     void sum() {
//         c = a + b;
//         System.out.println("Sum (Super): " + c);
//     }
// }

// class Sub extends Super1 {
//     int a1, b1, c1;

//     @Override
//     void sum() {
//         super.sum();   // call parent method first

//         a1 = 10;
//         b1 = 20;
//         c1 = b1 - a;
//         System.out.println("Subtraction (Sub): " + c1);
//     }
// }

// public class B {
//     public static void main(String[] args) {
//         Sub s = new Sub();
//         s.sum();
//     }
// }



// Multilevel inheritence 

import java.util.Scanner;

class Num1{
    protected int num1;

    public void input1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = sc.nextInt();
    }
}

class Num2 extends Num1 {
    protected int num2;

    public void input2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Second number");
        num2 = sc.nextInt();
    }
}

class Summ extends Num2{
    public void calculateSum(){
        int result = num1+num2;
        System.out.println("Sum of "+num1+" and " +num2+ " is "+result );
    }

    public static void main(String[] args){
        Summ obj = new Summ();
        obj.input1();
        obj.input2();
        obj.calculateSum();
    }
}