Problem: Check if a Number is Prime
File: PrimeCheck.java

Description:
Write a Java program that takes an integer input and checks if the number is prime or not.
Example:
Input: 7
Output: 7 is a prime number.

Input: 12
Output: 12 is not a prime number.

This file contains:
 - A short problem statement (above)
 - A clean solution with a helper method `isPrime`
 - Basic input handling (reads one integer from stdin)

import java.util.Scanner;

public class PrimeCheck {
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Main method: reads integer input and prints if prime or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        sc.close();
    }
}
