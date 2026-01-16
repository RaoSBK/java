import java.io.*;

public class main {
    public static void main (String[] args) {
        String Fname= "Suraj Bhan";
        String Lname = "Kumar";
        System.out.println(Fname.length()); // find the length with the help of dot operator
        System.out.println(Fname + " " + Lname); // concatinating 
        System.out.println(Fname.charAt(4)); //print the letter from string with the help of index value
        String name = Fname.replace('a', 'k'); // replacing the specific function with the help of specific character 
        System.out.println(name);
        System.out.println(Fname.substring(0, 6));
    }
}