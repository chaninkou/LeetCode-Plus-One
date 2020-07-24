package leetcode66;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] digits = {9,9,9};
		
		System.out.println("Input: " + Arrays.toString(digits));
		
		PlusOneToArrayFunction solution = new PlusOneToArrayFunction();
		
		System.out.println("Solution: " + Arrays.toString(solution.plusOne(digits)));
	}
}
