import java.util.Scanner;

public class ArithmeticException1{
    static void checkAge(int age){
        if(age <= 0 ){
                System.out.println("Invalid age ");
        } else if (age > 0 && age <= 17){
            throw new ArithmeticException("Access denied - You must be at least 18 years old ");
        } else {
            System.out.println("Access granted- You are old enough to vote!");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        checkAge(age);
    }    
    
}