package sweeft;

import java.util.ArrayList;
import java.util.HashMap;

import dataStructure.DataStructure;

public class test {

	public static void main(String[] args) {
		
		
	}

	private static int singleNumber(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];
			if (arr.contains(n)) {
				arr.remove(arr.indexOf(n));
			} else {
				arr.add(n);
			}
		}

		return arr.get(0);
	}

	private static int minSplit(int amount) {
		// base case
		if (amount == 0) {
			return 0;
		}
		
		if (amount - 50 >= 0) {
			return 1 + minSplit(amount - 50);
		}
		if (amount - 20 >= 0) {
			return 1 + minSplit(amount - 20);
		}
		if (amount - 10 >= 0) {
			return 1 + minSplit(amount - 10);
		}
		if (amount - 5 >= 0) {
			return 1 + minSplit(amount - 5);
		}

		return 1 + minSplit(amount - 1);
	}
	
	private static int countVariants(int stairsCount) {
		// base cases
		if(stairsCount == 0) {
			return 1;
		}
		if(stairsCount < 0) {
			return 0;
		}
		
		return countVariants(stairsCount - 2) + countVariants(stairsCount - 1);
	}
	
	private static String addBinaryStrings(String a, String b) {
		int x = Integer.parseInt(a, 2);
		int y = Integer.parseInt(b, 2);
		int sum = x+y;
		String s = Integer.toBinaryString(sum);
		
		return s;
	}
	
	private static int notContains(int[] array) {
		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		for(int i = 0; i < array.length; i++) {
			data.put(i, array[i]);
		}
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			if(!data.containsValue(i)) {
				return i;
			}
		}
		
		return 0;
	}
}
