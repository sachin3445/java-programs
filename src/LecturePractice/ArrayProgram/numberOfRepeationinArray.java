package LecturePractice.ArrayProgram;

import java.util.Arrays;

public class numberOfRepeationinArray {

	public static void main(String[] args) {
		int a[]= {10,20,50,10,30,40,10,10,30,10};
		int searchno=10, count=0;
		System.out.println("All number is Array a"+Arrays.toString(a));
		
		for(int x:a)
		{
			if(x==searchno)
			{
				count++;
			}
		}
		System.out.println("Total number of repeation of search number is: "+count);
	}

}
