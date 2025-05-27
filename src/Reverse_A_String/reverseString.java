package Reverse_A_String;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		String s= "";
		String rev = "";
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String for reverse: ");
		s=sc.nextLine();
		
		int len = s.length();
		for(int i=len-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println("Reverse String is: " + rev);
	
	}
}
