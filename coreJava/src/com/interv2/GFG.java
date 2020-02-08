package com.interv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GFG {
	// Function to check if array has 2 elements
	// whose sum is equal to the given value
	static boolean hasArrayTwoCandidates(int A[], int arr_size, int sum) {
		int l, r;

		/* Sort the elements */
		Arrays.sort(A);

		/*
		 * Now look for the two candidates in the sorted array
		 */
		l = 0;
		r = arr_size - 1;
		while (l < r) {
			if (A[l] + A[r] == sum)
				return true;
			else if (A[l] + A[r] < sum)
				l++;
			else // A[i] + A[j] > sum
				r--;
		}
		return false;
	}

	// Driver code
	public static void main(String args[]) {
		int A[] = { 1, 4, 45, 6, 10, -8 };
		int n = 16;
		int arr_size = A.length;

		// Function calling
		if (hasArrayTwoCandidates(A, arr_size, n))
			System.out.println("Array has two " + "elements with given sum");
		else
			System.out.println("Array doesn't have " + "two elements with given sum");
	}
}

class SumOfTwoNo {
	static void printpairs(int arr[], int sum) {
		List<Integer> s = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			if (s.contains(temp)) {
				System.out.println("Sum of Pair : " + sum + " is (" + arr[i] + ", " + temp + ")");
			}
			s.add(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 44, 2, 22, 1, 4, 45, 6, 50, 50, 10, 8, 45, 55, 100, 100, 20, 80 };
		int n = 100;
		printpairs(arr, n);
	}
}