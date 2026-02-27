import java.util.Scanner;

public class tryCatchFinally{
    public static void main(String args[]){
        
        try{
            
            Scanner sc = new Scanner(System.in);
            int num1=0;
            int num2=0;
            int n;

            n=0;
            while (n < 3){

                System.out.println("Enter the first number which is an even number");
                num1 = sc.nextInt();
                if(num1 % 2 == 0){
                    System.out.println("Your enterd input is "+num1);
                    break;
                } else {
                    
                    if(n<3){
                        System.out.println("Try to enter even number only");
                    } else {
                        System.out.println("Too many wrong attempts are enterd ");
                        return;
                    }
                    
                }
                n++;
            }

            n=0;
            while(n<3){
                System.out.println("Enter the second number which is an odd number");
                num2 = sc.nextInt();
                if(num2 % 2 != 0){
                    System.out.println("Your input is "+ num2);
                    break;
                } else {
                    n++;
                    if(n<3){
                        System.out.println("Try again, Enter an odd number");
                    } else {
                        System.out.println("Too many wrong attempts");
                    }
                }
            }
            

            int result = num1/num2;
            System.out.println("Result: "+result);
            sc.close();

        } catch (ArithmeticException e){
            System.out.println("An Exception occured"+e.getMessage());
        } finally {
            System.out.println("The finally block is always executed");
        }

        System.out.println("Program continues after the try-catch-finally block.");
    }
}