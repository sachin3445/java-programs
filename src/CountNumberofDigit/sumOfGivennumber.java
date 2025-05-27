package CountNumberofDigit;

import java.util.Scanner;

public class sumOfGivennumber {

		public static void main(String[] args) {
		
			int a, sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number: ");
			a=sc.nextInt();
			
			String num=String.valueOf(a);
			for(int i=0; i<num.length(); i++)
			{
				int digit=Character.getNumericValue(num.charAt(i));
						sum=sum+digit;
				
			}
			System.out.println("Total number of sum: "+sum);
		}
}

