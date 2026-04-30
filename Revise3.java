// Write a Java program to create a user-defined exception and handle it using try-catch. Explain throw and throws.

// Revise concepts:

// Custom exception
// Exception handling
// try-catch-finally
// throw vs throws


// class InvalidAgeException extends Exception {
//     public InvalidAgeException(String message) {
//         super(message);
//     }
// }

// public class Revise3 {
//     public static void checkAge(int age) throws InvalidAgeException {
//         if (age < 18) {
//             // throw keyword is used to explicitly throw an exception
//             throw new InvalidAgeException("Age must be 18 or above to vote.");
//         } else {
//             System.out.println("Valid age. You can vote!");
//         }
//     }

//     public static void main(String[] args) {
//         try {
//             checkAge(15);  // This will cause exception
//         } catch (InvalidAgeException e) {
//             System.out.println("Caught Exception: " + e.getMessage());
//         } finally {
//             System.out.println("Execution completed (finally block).");
//         }
//     }
// }


// Write a Java program to create a thread using the Runnable interface and explain the thread life cycle with diagram.

// Revise concepts:

// Multithreading
// Runnable interface
// start() vs run()


// class MyRunnable implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Thread running: " + i);
//             try {
//                 Thread.sleep(500); // pause for 0.5 sec
//             } catch (InterruptedException e) {
//                 System.out.println("Thread interrupted!");
//             }
//         }
//     }
// }

// public class Revise3 {
//     public static void main(String[] args) {
//         MyRunnable task = new MyRunnable();

//         Thread t1 = new Thread(task);

//         t1.start();

//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Main thread: " + i);
//             try {
//                 Thread.sleep(500);
//             } catch (InterruptedException e) {
//                 System.out.println("Main thread interrupted!");
//             }
//         }
//     }
// }



// Question 3

// Write a Java program to read and write data to a file using BufferedReader and BufferedWriter. Explain the difference between byte streams and character streams.

// 👉 Revise:

// File handling
// Buffered classes
// Streams (VERY IMPORTANT)


// import java.io.*;

// public class FileReadWriteDemo {
//     public static void main(String[] args) {
//         String fileName = "example.txt";

//         try {
//             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
//             writer.write("Hello, this is a test file.");
//             writer.newLine(); // adds a newline
//             writer.write("BufferedWriter makes writing efficient.");
//             writer.close();
//             System.out.println("Data written to file successfully.");

//             BufferedReader reader = new BufferedReader(new FileReader(fileName));
//             String line;
//             System.out.println("\nReading from file:");
//             while ((line = reader.readLine()) != null) {
//                 System.out.println(line);
//             }
//             reader.close();

//         } catch (IOException e) {
//             System.out.println("An error occurred: " + e.getMessage());
//         }
//     }
// }


// Write a Java program to implement a generic class and a generic method. Also explain bounded types with example.

// 👉 Revise:

// Generics
// <T> syntax
// Generic class vs method
// <T extends Number>


class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class GenericMethodDemo {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class Revise3 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        Box<String> strBox = new Box<>("Hello Generics");

        System.out.println("Integer Box contains: " + intBox.getValue());
        System.out.println("String Box contains: " + strBox.getValue());

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C"};

        System.out.print("Integer Array: ");
        GenericMethodDemo.printArray(intArray);

        System.out.print("String Array: ");
        GenericMethodDemo.printArray(strArray);
    }
}
