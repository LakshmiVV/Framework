package weekendhomework;

import java.util.Scanner;

public class FlorTriangle {

	public static void main(String[] args) {
		System.out.println("Enter the no. of rows");
		Scanner triangle = new Scanner(System.in);
		int flor = triangle.nextInt();
		int count =1;
		for (int i=1;i<=flor;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(count+ "  ");
			    count++;
		}
		
			
		System.out.println();
}

}
}