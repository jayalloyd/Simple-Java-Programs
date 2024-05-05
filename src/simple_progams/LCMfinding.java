package simple_progams;

import java.util.Scanner;

public class LCMfinding {
    // Function to find the GCD (Greatest Common Divisor) using recursive method
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Function to find the LCM (Least Common Multiple)
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int result = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + result);
        
        scanner.close();
    }
}
