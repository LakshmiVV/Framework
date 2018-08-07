package weekendhomework;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		Scanner swap = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = swap.nextInt();
		int b = swap.nextInt();
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("The value of two numbers after swapping is");
		System.out.println("firstNumber = " + a + " secondNumber is " + b);

	}

}
