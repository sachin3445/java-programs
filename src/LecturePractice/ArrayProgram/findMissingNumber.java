package LecturePractice.ArrayProgram;

import java.util.Arrays;

public class findMissingNumber {

	public static void main(String[] args) {
		int a[]= {1,2,4,3};
		int sum1=0, sum2=0;
		
		//calculate sum of all number in array {1,2,4,3};
		for (int x:a)
		{
			sum1=sum1+x;
		}
		
		
		//calculate sum of all series number in array {1,2,3,4,5}
		
	for (int i=0; i<=5; i++)
	{
		sum2=sum2+i;
	}

	System.out.println("Missing number is: "+ (sum2-sum1));
	}

}
