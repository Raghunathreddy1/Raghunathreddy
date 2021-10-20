package day2;

public class MinArray {
	public static void main(String[] args) {
		int[] arr = { 23, 67, 45, 78, 45 };

		int minNum = arr[0];

		for (int i : arr) {
			if (i < minNum)
				minNum = i;
		}

		System.out.println("Minimum number = " + minNum);
	}
}