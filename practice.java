import java.io.*;
import java.util.*;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        // String Fname= "Suraj Bhan";
        // String Lname = "Kumar";
        // System.out.println(Fname.length()); // find the length with the help of dot operator
        // System.out.println(Fname + " " + Lname); // concatinating 
        // System.out.println(Fname.charAt(4)); //print the letter from string with the help of index value
        // String name = Fname.replace('a', 'k'); // replacing the specific function with the help of specific character 
        // System.out.println(name);
        // System.out.println(Fname.substring(0, 6)); // returnign a sub part of string


        // //learning premitive data type
        // int physics = 75;
        // int chem = 84;
        // int mathematics = 98;

        // int[] marks = new int[3];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2]= 95;

        // System.out.println(marks[1]);
        


        //Array
        // System.out.println(marks[0]);
        // Arrays.sort(marks);
        // System.out.println(marks[0]);


        // 2d array
        // int[] [] finalMarks = {{97,94,99},{88,87,89}};
        // System.out.println(finalMarks[1][2]);


        // casting (converting variable form one type to another )
        // double price = 100.00;
        // double finalPrice = price +18;
        // System.out.println(finalPrice);

        // int p = 100;
        // int fp = p + (int)18.0;
        // System.out.println(fp);

        //Constants
        // final float pi = 3.145F;
        
        // System.out.println(pi);



        // // operators
        // int a = 1;
        // int b = 2;
        // int add = a+b;
        // System.out.println(add);



        // System.out.println(Math.min(a,b));
        // System.out.println(Math.max(a,b));
        // System.out.println((int)(Math.random()*100));

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input Your age: ");
        // int age = sc.nextInt();
        // System.out.println(age);


        // Taking the input from user
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age: ");
        // int age = sc.nextInt();
        // System.out.println(age);
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = sc.nextLine();
        // System.out.println(name);

        // // Comparasion Operator
        // // Conditional statement 
        
        // boolean isSunUp = true;
        // if(isSunUp == true){
        //     System.out.println("day");
        // } else{
        //     System.out.println("Night");
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age: ");
        // int age = sc.nextInt();

        // if(age >= 18)
        //     System.out.println("you are able to vote");

        // else 
        //     System.out.println("you are not able to vote");


        int a = 60;
        int b = 40;


        // if(a < 50 && b<50)
        //     System.out.println("both less than 50");

        // else 
        //     System.out.println("not not true");

        if(a<50 || b>50)
            System.out.println("Atlest one is greater than 50");

        else 
            System.out.println("False");
    }
}