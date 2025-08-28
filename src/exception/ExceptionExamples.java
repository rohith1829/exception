package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class ExceptionExamples {
	

 // Problem 1: Try and Catch Block
 public static void problem1(Scanner sc) {
     try {
         System.out.print("Enter a number (Problem 1): ");
         int num = sc.nextInt();
         int result = 100 / num;
         System.out.println("Result = " + result);
     } catch (ArithmeticException e) {
         System.out.println("Error: Cannot divide by zero.");
     }
 }

 // Problem 2: Multiple Catch Blocks
 public static void problem2(Scanner sc) {
     try {
         System.out.print("Enter first number (Problem 2): ");
         int a = sc.nextInt();
         System.out.print("Enter second number: ");
         int b = sc.nextInt();
         int result = a / b;
         System.out.println("Result = " + result);
     } catch (ArithmeticException e) {
         System.out.println("Error: Division by zero.");
     } catch (InputMismatchException e) {
         System.out.println("Error: Please enter integers only.");
     }
 }

 // Problem 3: Custom Checked Exception
 public static void problem3(Scanner sc) {
     try {
         System.out.print("Enter age (Problem 3): ");
         int age = sc.nextInt();
         if (age < 18) {
             throw new InvalidAgeException("Age must be 18 or older.");
         }
         System.out.println("Valid age: " + age);
     } catch (InvalidAgeException e) {
         System.out.println("Custom Exception Caught: " + e.getMessage());
     }
 }

 // Problem 4: Custom Unchecked Exception
 public static void problem4(Scanner sc) {
     try {
         System.out.print("Enter a number (Problem 4): ");
         int num = sc.nextInt();
         if (num < 0) {
             throw new NegativeNumberException("Number cannot be negative.");
         }
         System.out.println("Valid number: " + num);
     } catch (NegativeNumberException e) {
         System.out.println("Custom Runtime Exception: " + e.getMessage());
     }
 }

 // Problem 5: Exception Hierarchy
 public static void problem5(Scanner sc) {
     try {
         System.out.print("Enter option (1=Arithmetic, 2=NullPointer): ");
         int choice = sc.nextInt();

         if (choice == 1) {
             int x = 10 / 0; // ArithmeticException
         } else if (choice == 2) {
             String s = null;
             System.out.println(s.length()); // NullPointerException
         }
     } catch (ArithmeticException e) {
         System.out.println("Caught ArithmeticException.");
     } catch (NullPointerException e) {
         System.out.println("Caught NullPointerException.");
     } catch (Exception e) {
         System.out.println("Caught Generic Exception: " + e);
     }
 }
 // Problem 6: Finally Block
 public static void divisionWithFinally() {
     Scanner sc = new Scanner(System.in);
     try {
         System.out.print("Enter a number to divide 100: ");
         int num = sc.nextInt();
         int result = 100 / num;
         System.out.println("Result: " + result);
     } catch (ArithmeticException e) {
         System.out.println("Error: Division by zero is not allowed.");
     } finally {
         System.out.println("Division operation complete (finally block executed).");
     }
 }

 // Problem 7: Throwing Exceptions (Banking System)
 public static void withdraw(double balance, double amount) throws InsufficientFundsException {
     if (amount > balance) {
         throw new InsufficientFundsException("Withdrawal failed! Insufficient funds.");
     } else {
         System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + (balance - amount));
     }
 }
 // Problem 8: Exception Chaining with File Reading
 public static void exceptionChainingDemo() throws Exception {
     String filePath = "C:\\Users\\Rohith Kumar\\OneDrive\\Desktop\\employee.txt";
     try {
         BufferedReader br = new BufferedReader(new FileReader(filePath));
         String line;
         System.out.println("\nReading file contents:");
         while ((line = br.readLine()) != null) {
             System.out.println(line);
         }
         br.close();
     } catch (IOException e) {
         // Wrap IOException inside another Exception
         throw new Exception("Exception while processing file: " + filePath, e);
     }
 }

 public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    // Problem 1–5
	    problem1(sc);
	    problem2(sc);
	    problem3(sc);
	    problem4(sc);
	    problem5(sc);

	    // Problem 6: Finally Block
	    System.out.println("\n--- Problem 6: Finally Block ---");
	    divisionWithFinally();

	    // Problem 7: Throwing Exceptions (Banking)
	    System.out.println("\n--- Problem 7: Throwing Exceptions (Banking) ---");
	    double balance = 5000.0;
	    System.out.print("Enter withdrawal amount: ");
	    double amount = sc.nextDouble();
	    try {
	        withdraw(balance, amount);
	    } catch (InsufficientFundsException e) {
	        System.out.println(e.getMessage());
	    }

	    // Problem 8: Exception Chaining with File
	    System.out.println("\n--- Problem 8: Exception Chaining with File ---");
	    try {
	        exceptionChainingDemo();
	    } catch (Exception e) {
	        System.out.println("Caught Exception: " + e.getMessage());
	        System.out.println("Cause: " + e.getCause());
	    }

	    sc.close();
	}

}

