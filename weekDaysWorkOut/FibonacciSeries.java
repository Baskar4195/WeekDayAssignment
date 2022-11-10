package weekDaysWorkOut;

public class FibonacciSeries {

public static void main(String[] args) {

	
	
	//To find Fibonacci Series for a given input(range): // initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
	int n=8, firstNum=0, secNum=1;
	
	System.out.println("Fibonacci Series till " + n + " Nums:");
	

	// Iterate from 1 to the range
	for (int i = 0; i <= n; ++i) {
		
	
		
		// add first and second number assign to sum
		int nextNum = firstNum + secNum;
		
		// Assign second number to the first number
		firstNum = secNum;
		
		
		// Assign sum to the second number
	      secNum = nextNum;
	      
	      System.out.println(firstNum + ", ");
			
	}
	
	
	
	
	
	

	

	
	

}

}