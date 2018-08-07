package weekendhomework;

import java.util.Scanner;

public class DaillyCodingChallenge {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int temp = 0;

		System.out.println("enter number of elements");

		int n = s.nextInt();

		int arr[] = new int[n];

		System.out.println("enter elements");

		for (int i = 0; i < n; i++) {// for reading array

			arr[i] = s.nextInt();
		}

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					System.out.println("Duplicate Element : " + arr[j]);
				}
			}
		}
	}
}