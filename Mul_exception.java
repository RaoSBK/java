public class Mul_exception{
    public static void main(String[] args){
        int result;
        try{
            int[] numbers = {1,2,3};
           System.out.println(numbers[1]);
            result = 10/0;
            System.out.println(result+"");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index does not exits.");
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        } catch(Exception e){
            System.out.println("Something else went wrong:"+ e.getMessage());
        }
        
    }
}