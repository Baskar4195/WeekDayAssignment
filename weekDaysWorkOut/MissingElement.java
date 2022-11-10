package weekDaysWorkOut;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {

		// Here is the inputi int[] arr = {1,2,3,4,7,6,8};
		int[] a = { 1, 2, 3, 4, 7, 6, 8 };

		// Sort the array
		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i] + 1) {
				continue;
			} else {

				// check if the iterator variable is not equal to the array values respectively
				for (int j = a[i] + 1; j < a[i + 1]; j++) {

					// print the number
					System.out.println(j);
				}
			}
		}
	}
}