import java.util.Scanner;

public class Sum{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a[][] =new int [3][3];
        int b[][] =new int [3][3];
        int c[][] =new int [3][3];


        System.out.println("Enter the value of the matrix A[3]*[3]");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the value of the matrix B[3]*[3]");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Given matix A is");
        for(int i= 0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(a[i][j]+" ");
            }System.out.println();
        }

        System.out.println("Given matrix B is");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(b[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }


        System.out.println("The sum of the matrix A+B is ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}