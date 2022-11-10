package weekDaysWorkOut;
//Problem statement: Check if the number is positive or negative

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		
		//* 1. Initialize a number, say, int number= 35;
		 
		int num=35;
		
			//* If a number is negative, print "The number is negative"
		if(num < 0)
			{
			System.out.println("Negative");
		}
			// 2. If a number is positive, print "The number is positive"
			else if (num >0)
			 {			
			System.out.println("Positive");
			} 
		 
		
		//* If it nether negative nor positive, 
			 else  
		{
			//print as "The number is neither positive nor negative"
			
			System.out.println("The number is neither positive nor negative");
			
		} 
		}
	}

