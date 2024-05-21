package simple_progams;

	public class PascalsTriangle {
	    
	    // Method to generate and print Pascal's Triangle
	    public static void printPascalsTriangle(int numRows) {
	        // Create a 2D array to store the values of Pascal's Triangle
	        int[][] triangle = new int[numRows][];
	        
	        // Iterate through each row
	        for (int i = 0; i < numRows; i++) {
	            // Initialize the current row with i+1 elements
	            triangle[i] = new int[i + 1];
	            
	            // First and last elements of each row are 1
	            triangle[i][0] = 1;
	            triangle[i][i] = 1;
	            
	            // Calculate the values for the inner elements
	            for (int j = 1; j < i; j++) {
	                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
	            }
	        }
	        
	        // Print Pascal's Triangle
	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(triangle[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        int numRows = 5;  // Change this value to generate more or fewer rows
	        printPascalsTriangle(numRows);
	    }
	}


	
