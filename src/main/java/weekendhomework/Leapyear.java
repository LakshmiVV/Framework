package weekendhomework;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner year = new Scanner(System.in);
		int leap =year.nextInt();
		
		if(leap % 4 == 0 && !(leap % 100 == 0 && leap % 400 != 0)) {

            System.out.println(leap + " Is a Leap Year");
		}
		else {
            System.out.println(leap + " Is not a leap year");
        
        }   
				
}
}
