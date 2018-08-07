package weekendhomework;

import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the Number: ");
int number = scan.nextInt();
System.out.println("Enter the Target number to be  not present: ");
int targetNum = scan.nextInt();
int temp = 0;
int temp2 =0;
do{
int count =0;
number--;

temp2 = number;
do{
temp = temp2%10;

temp2 = (temp2-temp)/10;

if(temp==targetNum)
{
count--;
}
}while(temp2!=0);
if(count==0)
{
System.out.println(number);
break;
}
}while(number!=0);
}
}

