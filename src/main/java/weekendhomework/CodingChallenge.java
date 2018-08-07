package weekendhomework;

import java.util.Scanner;

public class CodingChallenge {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("a  " +a +" b =" +b);
		for (int i=a;i<=b;i++) {
			if (i%3==0) {
			System.out.print("FIZZ");
			}
			else if(i%5==0)
			{
				System.out.print(" BUZZ ");
				if (i%3==0) 
					System.out.print("FIZZBUZZ ");
			}
			else if (i%3!=0 || i%5!=0) {

				System.out.print(" " +i +" " );
			}
			if (i%3==0 && i%5==0)
			{
				System.out.print("BUZZ ");
			}	

	}

}
}
