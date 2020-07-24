package leetcode66;

public class PlusOneToArrayFunction {
	public int[] plusOne(int[] digits) {
		
		for (int i = digits.length - 1; i >= 0; i--) {
			// If its less than 9, just add one and return right away
			if (digits[i] < 9) {
				digits[i] = digits[i] + 1;
				return digits;
			}

			// For example: [1,9], If last element is 9, then replace it with 0
			digits[i] = 0;
		}

		// Making an extra space to insert 1 at the beginning
		int[] newNumber = new int[digits.length + 1];

		// example: [9] -> [1,0] or [9,9] -> [1,0,0]
		newNumber[0] = 1;

		// This will only occur when the if statement doesn't go through
		// example: 9,9,9
		return newNumber;
	}
}
