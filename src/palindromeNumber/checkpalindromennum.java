package palindromeNumber;

import java.util.Scanner;

public class checkpalindromennum {

	public static void main(String[] args) {
		int num, rev=0, orignal;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number: ");
			num=sc.nextInt();
		}
		orignal=num;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if (orignal==rev)
		{
			System.out.println("Given number is palindrom number: "+rev);
		}
		else 
		{
			System.out.println("Given number is not palindrom number: "+rev);
		}

	}

}
