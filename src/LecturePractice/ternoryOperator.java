package LecturePractice;

import java.util.Scanner;

public class ternoryOperator {

	public static void main(String[] args) {
	int a, b, c;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the values of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
	}
	c=(a>b)? a:b; 
	System.out.println("The largest number between a and b is: " +c);

	}

}
