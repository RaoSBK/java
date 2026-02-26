public class tryCatchFinally{
    public static void main(String args[]){
        try{
            double num1 = 10.28;
            int num2 = 5;

            double result = num1/num2;
            System.out.println("Result: "+result);
        } catch (ArithmeticException e){
            System.out.println("An Exception occured"+e.getMessage());
        } finally {
            System.out.println("The finally block is always executed");
        }

        System.out.println("Program continues after the try-catch-finally block.");
    }
}