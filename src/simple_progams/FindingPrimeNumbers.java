package simple_progams;
import java.util.*;

public class FindingPrimeNumbers {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();
	        System.out.println("Prime numbers between 1 and " + n + " are:");
	        for (int i = 2; i <= n; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	        scanner.close();
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= num/2; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	
}

