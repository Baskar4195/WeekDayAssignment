package weekDaysWorkOut;

public class ArmstrongNumber {

	public static void main(String[] args) {

		// Declare 3 more int variables as calculated, remainder, original (Tip:
		// Initialize calculated alone)

		int num = 153, calculated, remainder, original;
		calculated = num;

		original = 0;

		// Use loop to calculate: use while loop to set condition until the number
		// greater than 0
		while (calculated > 0) {
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			remainder = calculated % 10;

			// Within loop: Add calculated with the cube of remainder & assign it to
			// calculated
			original = original + (remainder * remainder * remainder);

			// Within loop: get the quotient when done by 10 (Tip: Assign the result to
			// input)
			calculated = calculated / 10;
		}

		// Check whether calculated and original are same
		if (original == num) {

			// When it matches print it as Armstrong number
			System.out.println(num + " Is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number");

		}
	}

}
