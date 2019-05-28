package hackerRankChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TwoDArrray {

	public static void main(String[] args) {
		System.out.println("Testing");
		TwoDArrray twoDArray = new TwoDArrray();
		Scanner sc = new Scanner(System.in);
		// input Array
		System.out.println("enter the array length");
		int arrayLenght = sc.nextInt();
		int[][] arr = new int[arrayLenght][arrayLenght];
		for (int i = 0; i < arrayLenght; i++) {
			for (int j = 0; j < arrayLenght; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		//System.out.println(twoDArray.outputSum(arr, 0, 0));
		find(arr);
	}

	private static void find(int[][] arr) {
		final int n = arr.length;
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				int n1 = arr[i - 1][j - 1];
				int n2 = arr[i - 1][j];
				int n3 = arr[i - 1][j + 1];
				int n4 = arr[i][j];
				int n5 = arr[i + 1][j - 1];
				int n6 = arr[i + 1][j];
				int n7 = arr[i + 1][j + 1];
				list.add(n1 + n2 + n3 + n4 + n5 + n6 + n7);
			}
		}
		System.out.println(Collections.max(list));
	}

	public int outputSum(int[][] arr, int i, int j) {
		int n = i + 3;
		int m = j + 3;
		int sum = 0;
		for (; i < n; i++) {
			for (; j < m; j++) {
				System.out.println("array : " + arr[i][j]);
				sum += arr[i][j];
			}
			j = 0;
		}

		return sum;
	}

}
