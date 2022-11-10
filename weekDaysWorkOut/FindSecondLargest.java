package weekDaysWorkOut;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int arr[] = { 3, 2, 11, 4, 6, 7 };

		// 1) Arrange the array in ascending order
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
		}

		// 2) Pick the 2nd element from the last and print it
		System.out.println("SecondLargestNum: ");
		System.out.println(arr[arr.length - 2]);

	}
}