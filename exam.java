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


//Revision of multi_exception java
public class Mul_exception{
    public static void main(String[] args){
        int  result;

        try{
            int[] arr= {1,2,3,4,5};
            System.out.println(arr[1]);
            result  = 10/0;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is not found");
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        } catch (Exception e){
            System.out.println("Somthing else was happened "+ e.getMessage());
        }
    }
}