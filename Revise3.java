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


class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

public class Revise3 {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();

        Thread t1 = new Thread(task);

        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted!");
            }
        }
    }
}
