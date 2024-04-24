package simple_progams;


	public class Factorial {
	    // Method to calculate factorial iteratively
	    public static int factorialIterative(int n) {
	        int result = 1;
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }

	    // Method to calculate factorial recursively
	    public static int factorialRecursive(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * factorialRecursive(n - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int number = 5; // Change the number to find factorial for a different number
	        int factorialIter = factorialIterative(number);
	        int factorialRec = factorialRecursive(number);

	        System.out.println("Factorial of " + number + " using iterative method is: " + factorialIter);
	        System.out.println("Factorial of " + number + " using recursive method is: " + factorialRec);
	    }
	}


