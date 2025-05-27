package Reverse_A_Number;

import java.util.Scanner;

public class usingMathCalculation {
	public static void main(String[] args) {

	int a, rev=0;

	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the number want to reverse: ");
		a=sc.nextInt();
	}
	while(a!=0)
	{
		rev=rev*10+a%10;
		a=a/10;
	}
	System.out.println("Reverse number is: " + rev);
	
	}
}

