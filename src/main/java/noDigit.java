import java.util.Scanner;

public class noDigit {

	public static void main(String[] args) {
		{
			int gno=0,lno=gno-1,gd=5,num,r;
			System.out.println("Enter the numbers");
			Scanner sc = new Scanner(System.in);
			gno=sc.nextInt();
			System.out.println("Enter the target number");	
			lno=sc.nextInt();	

			while(lno!=0)
			{
				num=lno;
				int c=0;
				while(num>0)
				{
					r=num%10;
					num=num/10;
					if(r==gd)
					{
						c++;
						break;
					}
				}
				if(c==1)
				{
					lno--;
				}
				else{
					break;
				}
			}
			System.out.println(lno);
		}
	}
}
